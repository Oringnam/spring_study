package chapter5;

import lombok.Getter;

/**
 * @author Jin Won Park, oringnam
 * @since 2019-01-15
 */
public enum Level {
    BASIC(1, Level.SILVER),
    SILVER(2, Level.GOLD),
    GOLD(3, null);

    @Getter
    private final int value;
    @Getter
    private final Level next;

    Level(int value, Level next) {
        this.value = value;
        this.next = next;
    }

    public static Level valueOf(int value) {
        switch (value) {
            case 1:
                return BASIC;
            case 2:
                return SILVER;
            case 3:
                return GOLD;
            default:
                throw new AssertionError("Unknown value : " + value);
        }
    }
}
