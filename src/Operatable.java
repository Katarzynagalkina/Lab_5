import java.util.Comparator;

public interface Operatable extends Comparator<Ball> {
    @Override
    int compare(Ball o1, Ball o2);
}
