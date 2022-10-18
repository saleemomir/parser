package mir.saleem.converter;

import java.io.File;

public abstract class Converter<T> {
    public abstract T convert(File f);
}
