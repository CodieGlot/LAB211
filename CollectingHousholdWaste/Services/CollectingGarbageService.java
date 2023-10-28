package Services;

import Data.CollectingGarbageDao;
import Models.GarbageTruck;

public class CollectingGarbageService implements ICollectingGarbageService {
    @Override
    public void getInput(GarbageTruck g) {
        CollectingGarbageDao.Instance().getInput(g);
    }

    @Override
    public void printTheCost(GarbageTruck g) {
        CollectingGarbageDao.Instance().printTheCost(g);
    }
}
