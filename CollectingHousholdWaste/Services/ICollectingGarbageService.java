package Services;

import Models.GarbageTruck;

public interface ICollectingGarbageService {

    void getInput(GarbageTruck g);

    void printTheCost(GarbageTruck g);

}