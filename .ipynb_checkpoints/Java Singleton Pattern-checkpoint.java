import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton{
    public String str;
    private static final Singleton inst=new Singleton();
    private Singleton()
    {
        
    }
    static Singleton getSingleInstance()
    {
        return inst;
    }
}