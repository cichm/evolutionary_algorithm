package Mmath;

public class Mmath {
    public final static Function<Tuple<Integer, Integer>, Integer> min = x -> (x._1 < x._2) ? x._1 : x._2;
}
