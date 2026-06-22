public class InterviewBot {

    private String botName;
    private String technology;

    public InterviewBot(String botName, String technology) {
        this.botName = botName;
        this.technology = technology;
    }

    public void conductInterview() {
        System.out.println(botName + " is conducting a " + technology + " interview.");
    }

    public static void main(String[] args) {

        InterviewBot javaBot = new InterviewBot("JavaBot", "Java");
        InterviewBot pythonBot = new InterviewBot("PythonBot", "Python");
        InterviewBot reactBot = new InterviewBot("ReactBot", "React");

        javaBot.conductInterview();
        pythonBot.conductInterview();
        reactBot.conductInterview();
    }
}
