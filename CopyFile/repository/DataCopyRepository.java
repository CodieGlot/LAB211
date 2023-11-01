/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.DataCopyDao;
import model.FileData;

/**
 *
 * @author Admin
 */
public class DataCopyRepository implements IDataCopyRepository {
    @Override
     public void dataCopy(FileData data) {
        DataCopyDao.Instance().dataCopy(data);
    }
}
