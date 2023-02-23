package com.promigas_storage.repository;


import com.promigas_storage.DTO.ConnectionInfo;

public interface SecretPort {
    public ConnectionInfo querySecretConnection(String secretName);
}
