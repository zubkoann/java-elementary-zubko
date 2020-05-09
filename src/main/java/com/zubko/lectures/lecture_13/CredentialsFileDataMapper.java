package com.zubko.lectures.lecture_13;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CredentialsFileDataMapper implements CredentialsDataMapper {
    private List<Credentials> creds = new ArrayList<>();

    public CredentialsFileDataMapper() {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("password-manager.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String item[] = line.split(",");
                creds.add(new Credentials(item[0].trim(), item[1].trim(), item[2].trim(), item[3].trim()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Something wrong");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {

                }
            }
        }
    }

    @Override
    public Credentials findCredentialsByService(String service) {
        for (Credentials c : creds) {
            if (c.getService().equals(service.trim())) {
                return c;
            }
        }
        throw new CredentialsNotFoundException("No credential for " + service);
    }

    @Override
    public Credentials findById(String id) {
        for (Credentials c : creds) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        throw new CredentialsNotFoundException("No credential for " + id);
    }

    @Override
    public Credentials delete(String id) {
        Credentials c = findById(id);
        creds.remove(c);
        return c;
    }

    @Override
    public Credentials update(String ind, Credentials cr) {
        Credentials c = findById(ind);
        int index = creds.indexOf(c);
        creds.add(index, cr);
        return cr;
    }

    @Override
    public Credentials create(Credentials cr) {
        creds.add(cr);
        return cr;
    }

    @Override
    public List<Credentials> getAll() {
        return creds;
    }
}
