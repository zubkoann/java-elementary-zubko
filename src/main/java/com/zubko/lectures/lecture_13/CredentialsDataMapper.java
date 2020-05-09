package com.zubko.lectures.lecture_13;

import java.util.List;

public interface CredentialsDataMapper {
 Credentials findCredentialsByService(String service);

 Credentials findById(String id);

 Credentials delete(String id);

 Credentials update(String id, Credentials cr);

 Credentials create(Credentials cr);

 List<Credentials> getAll();
}
