
class Prize {

    private String PrizeName;
    private double PrizeWorth;
    private double PrizeCost;
    public Prize() {
    }
    public Prize(String prizeName, double prizeWorth, double prizeCost) {
        PrizeName = prizeName;
        PrizeWorth = prizeWorth;
        PrizeCost = prizeCost;
    }
    public String getPrizeName() {
        return PrizeName;
    }
    public void setPrizeName(String prizeName) {
        PrizeName = prizeName;
    }
    public double getPrizeWorth() {
        return PrizeWorth;
    }
    public void setPrizeWorth(double prizeWorth) {
        PrizeWorth = prizeWorth;
    }
    public double getPrizeCost() {
        return PrizeCost;
    }
    public void setPrizeCost(double prizeCost) {
        PrizeCost = prizeCost;
    }
    public String TheNameOfPrize(int item) {
        if (item == 1) {
            PrizeName = "Pen";
        } else if (item == 2) {
            PrizeName = "Book";
        } else if (item == 3) {
            PrizeName = "DVD";
        } else if (item == 4) {
            PrizeName = "Mouse";
        } else if (item == 5) {
            PrizeName = "Keyboard";
        }
        return PrizeName;
    }
    public double TheWorthOfPrize(int item) {
        PrizeWorth = 0;
        if (item == 1) {
            PrizeWorth = 10;
        }
        if (item == 2) {
            PrizeWorth = 20;
        }
        if (item == 3) {
            PrizeWorth = 30;
        }
        if (item == 4) {
            PrizeWorth = 40;
        }
        if (item == 5) {
            PrizeWorth = 50;
        }

        return PrizeWorth;

    }
    public double TheCostOfPrize(int item) {
        PrizeCost = 0;
        if (item == 1) {
            PrizeCost = 1;
        }
        if (item == 2) {
            PrizeCost = 2;
        }
        if (item == 3) {
            PrizeCost = 3;
        }
        if (item == 4) {
            PrizeCost = 4;
        }
        if (item == 5) {
            PrizeCost = 5;
        }
        return PrizeCost;
    }
}
