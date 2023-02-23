package com.promigas_storage.entity;

import com.google.gson.Gson;
import com.promigas_storage.DTO.ConnectionInfo;
import com.promigas_storage.repository.SecretPort;
import com.promigas_storage.repository.SecretRepository;
import com.promigas_storage.repository.SecretRepositoryImpl;


public class SecretAdapter implements SecretPort {
    @Override
    public ConnectionInfo querySecretConnection(String secretName) {
        SecretRepository repository = new SecretRepositoryImpl();
        String secretValue = repository.querySecret(secretName);
        return new Gson().fromJson(secretValue, ConnectionInfo.class);
    }
}
