package oppsPracticeProblem.Interfaces.AIBasedContentModerationPlatform;
interface SpamDetection {

    boolean isSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Spam posts are not allowed.");
    }
}