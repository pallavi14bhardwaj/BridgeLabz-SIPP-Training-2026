package oppsPracticeProblem.Interfaces.AIBasedContentModerationPlatform;
interface TextModeration {

    boolean isOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Offensive content is not allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        return post.contains("bad") ||
                post.contains("hate") ||
                post.contains("abuse");
    }
}
