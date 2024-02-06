package code;

public class Main {
    public static void main(String[] args) {
        var transferMoneyTask = new TransferMoneyTask();
        transferMoneyTask.execute();

        var generateReportTask = new GenerateReportTask();
        generateReportTask.execute();
    }
}
