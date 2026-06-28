package oppsPracticeProblem.Interfaces.AIBasedContentModerationPlatform;
class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public boolean isOffensive(String post) {
        return TextModeration.containsRestrictedWords(
                post.toLowerCase());
    }

    @Override
    public boolean isSpam(String post) {
        return post.toLowerCase().contains("buy now") ||
                post.toLowerCase().contains("click here");
    }

    // Resolve default method conflict
    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public static void main(String[] args) {

        String[] posts = {
                "I love Java programming.",
                "Buy now and get 50% discount!",
                "I hate this product.",
                "Click here to win money.",
                "Have a nice day!"
        };

        ContentModerator cm = new ContentModerator();

        cm.displayModerationPolicy();
        System.out.println();

        for (String post : posts) {

            if (cm.isSpam(post)) {
                System.out.println("\"" + post +
                        "\" -> Spam Post");
            }
            else if (cm.isOffensive(post)) {
                System.out.println("\"" + post +
                        "\" -> Offensive Post");
            }
            else {
                System.out.println("\"" + post +
                        "\" -> Valid Post");
            }
        }
    }
}