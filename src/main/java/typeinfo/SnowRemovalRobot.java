package typeinfo;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dylan
 * @version 1.00 6/25/2016 12:46
 */
public class SnowRemovalRobot implements Robot {
    private String name;

    public SnowRemovalRobot(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public String model() {
        return "SnowBot Series 11";
    }

    public List<Operation> operations() {
        return Arrays.asList(
                new Operation() {
                    public String description() {
                        return name + " can shovel snow";
                    }

                    public void command() {
                        System.out.println(name + " shoveling show");
                    }
                },
                new Operation() {
                    public String description() {
                        return name + " can chip ice";
                    }

                    public void command() {
                        System.out.println(name + " chipping ice");
                    }
                },
                new Operation() {
                    public String description() {
                        return name + " can clear the roof";
                    }

                    public void command() {
                        System.out.println(name + " clear roof");
                    }
                });
    }

    public static void main(String[] args) {
        Test.test(new SnowRemovalRobot("Slusher"));
    }
}
