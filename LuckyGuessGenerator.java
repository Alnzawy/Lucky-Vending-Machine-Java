public class LuckyGuessGenerator {
    private int randomNumber;
    public int GenerateRandomNumber()
    {
        int min = 1, max =5;
        int range = max -  min + 1;
        randomNumber = min +(int)(Math.random() * range) ;
        return randomNumber;
    }
    public int getRandomNumber()
    {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }
}
