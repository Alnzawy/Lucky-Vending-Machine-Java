import java.io.*;
import java.util.*;

class Player {
    private String playerName;
    private double totalSpending;
    private double totalWorth;
    private ArrayList<String> WonPrizes;

    public Player() {
        this.WonPrizes = new ArrayList<>();
        this.totalSpending = 0;
        this.totalWorth = 0;
    }


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public double getTotalSpending() {
        return totalSpending;
    }

    public void setTotalSpending(double spending) {
        this.totalSpending = spending;
    }

    public double getTotalWorth() {
        return totalWorth;
    }

    public void setTotalWorth(double totalWorth) {
        this.totalWorth += totalWorth;
    }

    public ArrayList<String> getWonPrizes() {
        return WonPrizes ;
    }

    public void setWonPrizes(ArrayList<String> wonPrizes) {
        WonPrizes = wonPrizes;
    }

    public void AddPrize(String Prizees, double Worth , double Spent) {
        Prize prize = new Prize();
        WonPrizes.add(Prizees);
        totalWorth += Worth;
        totalSpending += Spent;
    }


}