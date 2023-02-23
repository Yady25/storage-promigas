package com.promigas_storage.Service;

import com.promigas_storage.entity.StorageEntity;

import java.io.InputStream;
import java.util.List;

public interface IUploadService {
    public List<StorageEntity> getCustomersDataFromExcel(InputStream inputStream);
}
