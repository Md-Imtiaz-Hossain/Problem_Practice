package books.O1_head_first_java_3rd_edition.chapter_12.O4_stream;

import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream.iterate(1, element -> element + 1)
                .filter(element -> element % 5 == 0)
                .limit(5)
                .forEach(System.out::println);
    }
}

