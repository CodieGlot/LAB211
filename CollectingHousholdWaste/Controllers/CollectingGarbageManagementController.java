package Controllers;

import Models.GarbageTruck;
import Services.CollectingGarbageService;
import Services.ICollectingGarbageService;
import View.Menu;

public class CollectingGarbageManagementController extends Menu<String> {
    private ICollectingGarbageService garbageService;
    static String[] options = { "Input", "Print", "Exit" };
    GarbageTruck g;

    public CollectingGarbageManagementController() {
        super("===== COLLECTING GARBAGE MANAGEMENT =====", options);
        garbageService = new CollectingGarbageService();
        g = new GarbageTruck();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                garbageService.getInput(g);
                break;
            case 2:
                garbageService.printTheCost(g);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
