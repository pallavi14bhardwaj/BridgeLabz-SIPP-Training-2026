package oppsPracticeProblem.Interfaces.fitnesstracker;
class FitnessDeviceMain implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Steps and calories logged.");
    }

    @Override
    public void generateReport() {
        System.out.println("Weekly fitness report generated.");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert: Time for your workout!");
    }

    public static void main(String[] args) {
        FitnessDeviceMain device = new FitnessDeviceMain();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData(); // default method
    }
}