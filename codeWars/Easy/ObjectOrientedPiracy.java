package codeWars.Easy;

public class ObjectOrientedPiracy {
    public record Ship(double draft, int crew) {
        boolean isWorthIt() {
            return draft - 1.5 * crew > 20;
        }
    }
}
