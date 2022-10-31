package core.basesyntax.service.operations;

import core.basesyntax.dao.StorageDao;

public class BalanceHandler implements OperationHandler {
    private StorageDao storageDao;

    public BalanceHandler(StorageDao storageDao) {
        this.storageDao = storageDao;
    }

    @Override
    public void doOperation(String fruitName, Integer quantity) {
        storageDao.setQuantity(fruitName, quantity);
    }
}
