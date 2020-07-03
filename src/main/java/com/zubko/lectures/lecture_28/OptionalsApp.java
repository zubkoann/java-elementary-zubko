package com.zubko.lectures.lecture_28;

import java.util.Comparator;
import java.util.Optional;

public class OptionalsApp {
    public static void main(String[] args) {
        User user = new User("Anna", "Zubko", new Address(""));
        User user2 = new User("Anna2", "Zubko", new Address(""));
        Optional<User> optUser = Optional.empty();
        System.out.println("empty---" + optUser);

        Optional<User> opt = Optional.of(user);
        System.out.println("of---" + opt.get());

        User user3 = null;
        Optional<User> opt2 = Optional.ofNullable(user3);
        System.out.println("orElse---" + opt2.orElse(user2));
        System.out.println("orElseGet---" + opt2.orElseGet(() -> new User("dsf", "sdfsf", new Address(""))));
//        System.out.println("orElseThrow---"+opt2.orElseThrow(() -> new UserNotFoundException("kjkj")));

        if (opt2.isPresent()) {
            Address a = opt2.get().getAddress();
        }

        Comparator<Integer> compareInt = (a, b) -> {
            return a.compareTo(b);
        };

        Comparator<Integer> compareInt2 = (a, b) -> {
            if (a > 2 * b) return 1;
            else if (a == 2 * b) return 0;
            else return -1;
        };
        System.out.println(compareInt2.compare(2, 4));
    }
}
