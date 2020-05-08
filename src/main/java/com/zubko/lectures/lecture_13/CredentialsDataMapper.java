package com.zubko.lectures.lecture_13;

public interface CredentialsDataMapper {
    Credentials findCredentialsByService(String service);
}
