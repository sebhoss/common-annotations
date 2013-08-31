/*
 * Copyright © 2013 Sebastian Hoß <mail@shoss.de>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See http://www.wtfpl.net/ for more details.
 */
package com.github.sebhoss.common.annotation;

/**
 * List of PMD warnings which can be suppressed by the {@link SuppressWarnings} annotation.
 * 
 * @see <a
 *      href="http://pmd.sourceforge.net/pmd-5.0.1/suppressing.html">http://pmd.sourceforge.net/pmd-5.0.1/suppressing.html</a>
 */
@SuppressWarnings(CompilerWarnings.NLS)
public final class PMDWarnings {

    /**
     * Suppresses all PMD warnings
     */
    public static final String PMD                                               = "PMD";

    /**
     * Avoid jumbled loop incrementers - its usually a mistake, and is confusing even if intentional. <h2>Example</h2>
     * 
     * <pre>
     * public class JumbledIncrementerRule {
     *     public void foo() {
     *         for (int i = 0; i &lt; 10; i++) { // only references 'i'
     *             for (int k = 0; k &lt; 20; i++) { // references both 'i' and 'k'
     *                 System.out.println(&quot;Hello&quot;);
     *             }
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String JUMBLED_INCREMENTER                               = "PMD.JumbledIncrementer";

    /**
     * Some for loops can be simplified to while loops, this makes them more concise. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     void bar() {
     *         for (;true;) true; // No Init or Update part, may as well be: while (true)
     *     }
     * }
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * </pre>
     * 
     * @since PMD 1.02
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String FOR_LOOP_SHOULD_BE_WHILE_LOOP                     = "ForLoopShouldBeWhileLoop";

    /**
     * Override both public boolean Object.equals(Object other), and public int Object.hashCode(), or override neither.
     * Even if you are inheriting a hashCode() from a parent class, consider implementing hashCode and explicitly
     * delegating to your superclass. <h2>Example</h2>
     * 
     * <pre>
     * public class Bar { // poor, missing a hashcode() method
     *     public boolean equals(Object o) {
     *         // do some comparison
     *     }
     * }
     * 
     * public class Baz { // poor, missing an equals() method
     *     public int hashCode() {
     *         // return some hash value
     *     }
     * }
     * 
     * public class Foo { // perfect, both methods provided
     *     public boolean equals(Object other) {
     *         // do some comparison
     *     }
     * 
     *     public int hashCode() {
     *         // return some hash value
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String OVERRIDE_BOTH_EQUALS_AND_HASHCODE                 = "OverrideBothEqualsAndHashcode";

    /**
     * Partially created objects can be returned by the Double Checked Locking pattern when used in Java. An optimizing
     * JRE may assign a reference to the baz variable before it creates the object the reference is intended to point
     * to. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     Object baz;
     * 
     *     Object bar() {
     *         if (baz == null) { // baz may be non-null yet not fully created
     *             synchronized (this) {
     *                 if (baz == null) {
     *                     baz = new Object();
     *                 }
     *             }
     *         }
     *         return baz;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.04
     * @see <a
     *      href="http://www.javaworld.com/javaworld/jw-02-2001/jw-0209-double.html">http://www.javaworld.com/javaworld/jw-02-2001/jw-0209-double.html</a>
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String DOUBLE_CHECKED_LOCKING                            = "DoubleCheckedLocking";

    /**
     * Avoid returning from a finally block, this can discard exceptions. <h2>Example</h2>
     * 
     * <pre>
     * public class Bar {
     *     public String foo() {
     *         try {
     *             throw new Exception(&quot;My Exception&quot;);
     *         } catch (Exception e) {
     *             throw e;
     *         } finally {
     *             return &quot;A. O. K.&quot;; // return not recommended here
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.05
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String RETURN_FROM_FINALLY_BLOCK                         = "ReturnFromFinallyBlock";

    /**
     * Do not use "if" statements whose conditionals are always true or always false. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void close() {
     *         if (true) { // fixed conditional, not recommended
     *             // ...
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String UNCONDITIONAL_IF_STATEMENT                        = "UnconditionalIfStatement";

    /**
     * Avoid instantiating Boolean objects; you can reference Boolean.TRUE, Boolean.FALSE, or call Boolean.valueOf()
     * instead. <h2>Example</h2> </br> <code>
     * Boolean buz = Boolean.valueOf(false); // ...., just reference Boolean.FALSE</br>
     * </br>
     * Boolean bar = new Boolean(&quot;true&quot;); // unnecessary creation, just reference Boolean.TRUE</br>
     * </code>
     * </br>
     * 
     * @since PMD 1.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String BOOLEAN_INSTANTIATION                             = "BooleanInstantiation";

    /**
     * Sometimes two consecutive 'if' statements can be consolidated by separating their conditions with a boolean
     * short-circuit operator. <h2>Example</h2>
     * 
     * <pre>
     * void bar() {
     *     if (x) { // original implementation
     *         if (y) {
     *             // do stuff
     *         }
     *     }
     * }
     * 
     * void bar() {
     *     if (x &amp;&amp; y) { // optimized implementation
     *         // do stuff
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String COLLAPSIBLE_IF_STATEMENTS                         = "CollapsibleIfStatements";

    /**
     * When deriving an array of a specific class from your Collection, one should provide an array of the same class as
     * the parameter of the toArray() method. Doing otherwise you will will result in a ClassCastException. <h2>Example</h2>
     * 
     * <pre>
     * Collection c = new ArrayList();
     * Integer obj = new Integer(1);
     * c.add(obj);
     * 
     * // this would trigger the rule (and throw a ClassCastException if executed)
     * Integer[] a = (Integer[]) c.toArray();
     * 
     * // this is fine and will not trigger the rule
     * Integer[] b = (Integer[]) c.toArray(new Integer[c.size()]);
     * </pre>
     * 
     * @since PMD 3.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String CLASS_CAST_EXCEPTION_WITH_TO_ARRAY                = "ClassCastExceptionWithToArray";

    /**
     * One might assume that the result of "new BigDecimal(0.1)" is exactly equal to 0.1, but it is actually equal to
     * .1000000000000000055511151231257827021181583404541015625. This is because 0.1 cannot be represented exactly as a
     * double (or as a binary fraction of any finite length). Thus, the long value that is being passed in to the
     * constructor is not exactly equal to 0.1, appearances notwithstanding. The (String) constructor, on the other
     * hand, is perfectly predictable: 'new BigDecimal("0.1")' is exactly equal to 0.1, as one would expect. Therefore,
     * it is generally recommended that the (String) constructor be used in preference to this one. <h2>Example</h2>
     * <code></br>
     * BigDecimal bd = new BigDecimal(1.123);  // loss of precision, this would trigger the rule
     * </br>
     * BigDecimal bd = new BigDecimal("1.123");// preferred approach
     * </br>
     * BigDecimal bd = new BigDecimal(12);     // preferred approach, ok for integer values</br>
     * </code></br>
     * 
     * @since PMD 3.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_DECIMAL_LITERALS_IN_BIG_DECIMAL_CONSTRUCTOR = "AvoidDecimalLiteralsInBigDecimalConstructor";

    /**
     * The null check here is misplaced. If the variable is null a {@link NullPointerException} will be thrown. Either
     * the check is useless (the variable will never be "null") or it is incorrect. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     void bar() {
     *         if (a.equals(baz) &amp;&amp; a != null) {
     *         }
     *     }
     * }
     * 
     * public class Foo {
     *     void bar() {
     *         if (a.equals(baz) || a == null) {
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String MISPLACED_NULL_CHECK                              = "MisplacedNullCheck";

    /**
     * Avoid using java.lang.ThreadGroup; although it is intended to be used in a threaded environment it contains
     * methods that are not thread-safe. <h2>Example</h2>
     * 
     * <pre>
     * public class Bar {
     *     void buz() {
     *         ThreadGroup tg = new ThreadGroup(&quot;My threadgroup&quot;);
     *         tg = new ThreadGroup(tg, &quot;my thread group&quot;);
     *         tg = Thread.currentThread().getThreadGroup();
     *         tg = System.getSecurityManager().getThreadGroup();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_THREAD_GROUP                                = "AvoidThreadGroup";

    /**
     * The null check is broken since it will throw a NullPointerException itself. It is likely that you used || instead
     * of && or vice versa. <h2>Example</h2>
     * 
     * <pre>
     * public String bar(String string) {
     *     // should be &amp;&amp;
     *     if (string != null || !string.equals(&quot;&quot;))
     *         return string;
     *     // should be ||
     *     if (string == null &amp;&amp; string.equals(&quot;&quot;))
     *         return string;
     * }
     * </pre>
     * 
     * @since PMD 3.8
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String BROKEN_NULL_CHECK                                 = "BrokenNullCheck";

    /**
     * Don't create instances of already existing BigInteger (BigInteger.ZERO, BigInteger.ONE) and for Java 1.5 onwards,
     * BigInteger.TEN and BigDecimal (BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.TEN) <h2>Example</h2><code></br>
     * BigInteger bi = new BigInteger(1);       // reference BigInteger.ONE instead</br>
     * BigInteger bi2 = new BigInteger("0");   // reference BigInteger.ZERO instead</br>
     * BigInteger bi3 = new BigInteger(0.0);   // reference BigInteger.ZERO instead</br>
     * BigInteger bi4;</br>
     * bi4 = new BigInteger(0);                // reference BigInteger.ZERO instead</br>
     * </code></br>
     * 
     * @since PMD 3.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String BIG_INTEGER_INSTANTIATION                         = "BigIntegerInstantiation";

    /**
     * Integer literals should not start with zero since this denotes that the rest of literal will be interpreted as an
     * octal value. <h2>Example</h2><code></br>
     * int i = 012; // set i with 10 not 12</br>
     * int j = 010;    // set j with 8 not 10</br>
     * k = i * j;      // set k with 80 not 120</br>
     * </code>
     * </br>
     * 
     * @since PMD 3.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_USING_OCTAL_VALUES                          = "AvoidUsingOctalValues";

    /**
     * Application with hard-coded IP addresses can become impossible to deploy in some cases. Externalizing IP adresses
     * is preferable. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private String ip = &quot;127.0.0.1&quot;; // not recommended
     * }
     * </pre>
     * 
     * @since 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_USING_HARD_CODED_IP                         = "AvoidUsingHardCodedIP";

    /**
     * Always check the return values of navigation methods (next, previous, first, last) of a ResultSet. If the value
     * return is 'false', it should be handled properly. <h2>Example</h2><code></br>
     * Statement stat = conn.createStatement();</br>
     * ResultSet rst = stat.executeQuery("SELECT name FROM person");</br>
     * rst.next();     // what if it returns false? bad form</br>
     * String firstName = rst.getString(1);</br>
     * </br>
     * Statement stat = conn.createStatement();</br>
     * ResultSet rst = stat.executeQuery("SELECT name FROM person");</br>
     * if (rst.next()) {   // result is properly examined and used</br>
     *   String firstName = rst.getString(1);</br>
     * } else  {</br>
     *    // handle missing data</br>
     * }</br>
     * </code></br>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String CHECK_RESULT_SET                                  = "CheckResultSet";

    /**
     * The use of multiple unary operators may be problematic, and/or confusing. Ensure that the intended usage is not a
     * bug, or consider simplifying the expression. <h2>Example</h2> <code></br>
     * // These are typo bugs, or at best needlessly complex and confusing:</br>
     * int i = - -1;</br>
     * int j = + - +1;</br>
     * int z = ~~2;</br>
     * boolean b = !!true;</br>
     * boolean c = !!!true;</br>
     * </br>
     * // These are better:</br>
     * int i = 1;</br>
     * int j = -1;</br>
     * int z = 2;</br>
     * boolean b = true;</br>
     * boolean c = false;</br>
     * </br>
     * // And these just make your brain hurt:</br>
     * int i = ~-2;</br>
     * int j = -~7;</br>
     * </code></br>
     * 
     * @since PMD 4.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_MULTIPLE_UNARY_OPERATORS                    = "AvoidMultipleUnaryOperators";

    /**
     * No need to explicitly extend Object. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo extends Object { // not required
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String EXTENDS_OBJECT                                    = "ExtendsObject";

    /**
     * The skip() method may skip a smaller number of bytes than requested. Check the returned value to find out if it
     * was the case or not. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     * 
     *    private FileInputStream _s = new FileInputStream("file");
     * 
     *    public void skip(int n) throws IOException {
     *       _s.skip(n); // You are not sure that exactly n bytes are skipped
     *    }
     * 
     *    public void skipExactly(int n) throws IOException {
     *       while (n != 0) {
     *          long skipped = _s.skip(n);
     *          if (skipped == 0)
     *             throw new EOFException();
     *          n -= skipped;
     *       }
     *    }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String CHECK_SKIP_RESULT                                 = "CheckSkipResult";

    /**
     * Using a branching statement as the last part of a loop may be a bug, and/or is confusing. Ensure that the usage
     * is not a bug, or consider using another approach. <h2>Example</h2>
     * 
     * <pre>
     * // unusual use of branching statement in a loop
     * for (int i = 0; i &lt; 10; i++) {
     *     if (i * i &lt;= 25) {
     *         continue;
     *     }
     *     break;
     * }
     * 
     * // this makes more sense...
     * for (int i = 0; i &lt; 10; i++) {
     *     if (i * i &gt; 25) {
     *         break;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_BRANCHING_STATEMENT_AS_LAST_IN_LOOP         = "AvoidBranchingStatementAsLastInLoop";

    /**
     * Explicitly calling Thread.run() method will execute in the caller's thread of control. Instead, call
     * Thread.start() for the intended behavior. <h2>Example</h2><code></br>
     * Thread t = new Thread();</br>
     * t.run();            // use t.start() instead</br>
     * new Thread().run(); // same violation</br>
     * </code>
     * </br>
     * 
     * @since PMD 4.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String DONT_CALL_THREAD_RUN                              = "DontCallThreadRun";

    /**
     * Don't use floating point for loop indices. If you must use floating point, use double unless you're certain that
     * float provides enough precision and you have a compelling performance need (space or time). <h2>Example</h2>
     * 
     * <pre>
     * public class Count {
     *     public static void main(String[] args) {
     *         final int START = 2000000000;
     *         int count = 0;
     *         for (float f = START; f &lt; START + 50; f++)
     *             count++;
     *         // Prints 0 because (float) START == (float) (START + 50).
     *         System.out.println(count);
     *         // The termination test misbehaves due to floating point granularity.
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String DONT_USE_FLOAT_TYPE_FOR_LOOP_INDICES              = "DontUseFloatTypeForLoopIndices";

    /**
     * Avoid using if statements without using braces to surround the code block. If the code formatting or indentation
     * is lost then it becomes difficult to separate the code being controlled from the rest. <h2>Example</h2>
     * 
     * <pre>
     * if (foo) // not recommended
     *     x++;
     * 
     * if (foo) { // preferred approach
     *     x++;
     * }
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/braces.html">PMD Braces Rule Set Documentation</a>
     */
    public static final String IF_STMTS_MUST_USE_BRACES                          = "IfSTmtsMustUseBraces";

    /**
     * Avoid using 'while' statements without using braces to surround the code block. If the code formatting or
     * indentation is lost then it becomes difficult to separate the code being controlled from the rest. <h2>Example</h2>
     * 
     * <pre>
     * while (true)
     *     // not recommended
     *     x++;
     * 
     * while (true) { // preferred approach
     *     x++;
     * }
     * </pre>
     * 
     * @since PMD 0.7
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/braces.html">PMD Braces Rule Set Documentation</a>
     */
    public static final String WHILE_LOOPS_MUST_USE_BRACES                       = "WhileLoopsMustUseBraces";

    /**
     * Avoid using if..else statements without using surrounding braces. If the code formatting or indentation is lost
     * then it becomes difficult to separate the code being controlled from the rest. <h2>Example</h2>
     * 
     * <pre>
     * // this is OK
     * if (foo)
     *     x++;
     * 
     * // but this is not
     * if (foo)
     *     x = x + 1;
     * else
     *     x = x - 1;
     * </pre>
     * 
     * @since PMD 0.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/braces.html">PMD Braces Rule Set Documentation</a>
     */
    public static final String IF_ELSE_STATEMENTS_MUST_USE_BRACES                = "IfElseStmtsMustUseBraces";

    /**
     * Avoid using 'for' statements without using curly braces. If the code formatting or indentation is lost then it
     * becomes difficult to separate the code being controlled from the rest. <h2>Example</h2>
     * 
     * <pre>
     * for (int i = 0; i &lt; 42; i++)
     *     foo();
     * </pre>
     * 
     * @since PMD 0.7
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/braces.html">PMD Braces Rule Set Documentation</a>
     */
    public static final String FOR_LOOPS_MUST_USE_BRACES                         = "ForLoopsMustUseBraces";

    /**
     * Object clone() should be implemented with super.clone(). <h2>Example</h2>
     * 
     * <pre>
     * class Foo {
     *     public Object clone() {
     *         return new Foo(); // This is bad
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/clone.html">PMD Clone Implementation Rule Set
     *      Documentation</a>
     */
    public static final String PROPER_CLONE_IMPLEMENTATION                       = "ProperCloneImplementation";

    /**
     * The method clone() should throw a CloneNotSupportedException. <h2>Example</h2>
     * 
     * <pre>
     * public class MyClass implements Cloneable {
     *     public Object clone() { // will cause an error
     *         MyClass clone = (MyClass) super.clone();
     *         return clone;
     *     }
     * }
     * 
     * </pre>
     * 
     * @since PMD 1.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/clone.html">PMD Clone Implementation Rule Set
     *      Documentation</a>
     */
    public static final String CLONE_THROWS_CLONE_NOT_SUPPORTED_EXCEPTION        = "CloneThrowsCloneNotSupportedException";

    /**
     * The method clone() should only be implemented if the class implements the Cloneable interface with the exception
     * of a final method that only throws CloneNotSupportedException. <h2>Example</h2>
     * 
     * <pre>
     * public class MyClass {
     *     public Object clone() throws CloneNotSupportedException {
     *         return foo;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/clone.html">PMD Clone Implementation Rule Set
     *      Documentation</a>
     */
    public static final String CLONE_METHOD_MUST_IMPLEMENT_CLONEABLE             = "CloneMethodMustImplementCloneable";

    /**
     * The NPath complexity of a method is the number of acyclic execution paths through that method. A threshold of 200
     * is generally considered the point where measures should be taken to reduce complexity and increase readability.
     * <h2>Example</h2>
     * 
     * <pre>
     * void bar() { // this is something more complex than it needs to be,
     *     if (y) {    // it should be broken down into smaller methods or functions
     *         for (j = 0; j < m; j++) {
     *             if (j > r) {
     *                 doSomething();
     *                 while (f < 5 ) {
     *                     anotherThing();
     *                     f -= 27;
     *                     }
     *                 } else {
     *                     tryThis();
     *                 }
     *             }
     *         }
     *         if ( r - n > 45) {
     *            while (doMagic()) {
     *               findRabbits();
     *            }
     *         }
     *         try {
     *             doSomethingDangerous();
     *         } catch (Exception ex) {
     *             makeAmends();
     *             } finally {
     *                 dontDoItAgain();
     *                 }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String NPATH_COMPLEXITY                                  = "NPathComplexity";

    /**
     * When methods are excessively long this usually indicates that the method is doing more than its name/signature
     * might suggest. They also become challenging for others to digest since excessive scrolling causes readers to lose
     * focus. Try to reduce the method length by creating helper methods and removing any copy/pasted code. <h2>Example</h2>
     * 
     * <pre>
     * public void doSomething() {
     *     System.out.println(&quot;Hello world!&quot;);
     *     System.out.println(&quot;Hello world!&quot;);
     *     // 98 copies omitted for brevity.
     * }
     * </pre>
     * 
     * @since PMD 0.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String EXCESSIVE_METHOD_LENGTH                           = "ExcessiveMethodLength";

    /**
     * Methods with numerous parameters are a challenge to maintain, especially if most of them share the same datatype.
     * These situations usually denote the need for new objects to wrap the numerous parameters. <h2>Example</h2>
     * 
     * <pre>
     * public void addPerson(       // too many arguments liable to be mixed up
     *     int birthYear, int birthMonth, int birthDate, int height, int weight, int ssn) {
     * 
     *     . . . .
     * }
     *  
     * public void addPerson(      // preferred approach
     *     Date birthdate, BodyMeasurements measurements, int ssn) {
     * 
     *     . . . .
     * }
     * </pre>
     * 
     * @since PMD 0.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String EXCESSIVE_PARAMETER_LIST                          = "ExcessiveParameterList";

    /**
     * Excessive class file lengths are usually indications that the class may be burdened with excessive
     * responsibilities that could be provided by external classes or functions. In breaking these methods apart the
     * code becomes more managable and ripe for reuse. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void bar1() {
     *         // 1000 lines of code
     *     }
     * 
     *     public void bar2() {
     *         // 1000 lines of code
     *     }
     * 
     *     public void bar3() {
     *         // 1000 lines of code
     *     }
     * 
     *     public void barN() {
     *         // 1000 lines of code
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String EXCESSIVE_CLASS_LENGTH                            = "ExcessiveClassLength";

    /**
     * Complexity directly affects maintenance costs is determined by the number of decision points in a method plus one
     * for the method entry. The decision points include 'if', 'while', 'for', and 'case labels' calls. Generally,
     * numbers ranging from 1-4 denote low complexity, 5-7 denote moderate complexity, 8-10 denote high complexity, and
     * 11+ is very high complexity. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {       // This has a Cyclomatic Complexity = 12
     * 1   public void example()  {
     * 2       if (a == b)  {
     * 3           if (a1 == b1) {
     *                 fiddle();
     * 4           } else if a2 == b2) {
     *                 fiddle();
     *             }  else {
     *                 fiddle();
     *             }
     * 5       } else if (c == d) {
     * 6           while (c == d) {
     *                 fiddle();
     *             }
     * 7        } else if (e == f) {
     * 8           for (int n = 0; n < h; n++) {
     *                 fiddle();
     *             }
     *         } else{
     *             switch (z) {
     * 9               case 1:
     *                     fiddle();
     *                     break;
     * 10              case 2:
     *                     fiddle();
     *                     break;
     * 11              case 3:
     *                     fiddle();
     *                     break;
     * 12              default:
     *                     fiddle();
     *                     break;
     *             }
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.03
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String CYCLOMATIC_COMPLEXITY                             = "CyclomaticComplexity";

    /**
     * Classes with large numbers of public methods and attributes require disproportionate testing efforts since
     * combinational side effects grow rapidly and increase risk. Refactoring these classes into smaller ones not only
     * increases testability and reliability but also allows new variations to be developed easily. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public String   value;
     *     public Bar      something;
     *     public Variable var;
     * 
     *     // [... more more public attributes ...]
     * 
     *     public void doWork() {
     *     }
     * 
     *     public void doMoreWork() {
     *     }
     * 
     *     public void doWorkAgain() {
     *     }
     *     // [... more more public methods ...]
     * }
     * </pre>
     * 
     * @since PMD 1.04
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String EXCESSIVE_PUBLIC_COUNT                            = "ExcessivePublicCount";

    /**
     * Classes that have too many fields can become unwieldy and could be redesigned to have fewer fields, possibly
     * through grouping related fields in new objects. For example, a class with individual city/state/zip fields could
     * park them within a single Address field. <h2>Example</h2>
     * 
     * <pre>
     * public class Person { // too many separate fields
     *     int   birthYear;
     *     int   birthMonth;
     *     int   birthDate;
     *     float height;
     *     float weight;
     * }
     * 
     * public class Person { // this is more manageable
     *     Date             birthDate;
     *     BodyMeasurements measurements;
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String TOO_MANY_FIELDS                                   = "TooManyFields";

    /**
     * This rule uses the NCSS (Non-Commenting Source Statements) algorithm to determine the number of lines of code for
     * a given method. NCSS ignores comments, and counts actual statements. Using this algorithm, lines of code that are
     * split are counted as one. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo extends Bar {
     *     public int methd() {
     *         super.methd();
     * 
     *         // this method only has 1 NCSS lines
     *         return 1;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String NCSS_METHOD_COUNT                                 = "NcssMethodCount";

    /**
     * This rule uses the NCSS (Non-Commenting Source Statements) algorithm to determine the number of lines of code for
     * a given type. NCSS ignores comments, and counts actual statements. Using this algorithm, lines of code that are
     * split are counted as one. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo extends Bar {
     *     public Foo() {
     *         // this class only has 6 NCSS lines
     *         super();
     * 
     *         super.foo();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String NCSS_TYPE_COUNT                                   = "NcssTypeCount";

    /**
     * This rule uses the NCSS (Non-Commenting Source Statements) algorithm to determine the number of lines of code for
     * a given constructor. NCSS ignores comments, and counts actual statements. Using this algorithm, lines of code
     * that are split are counted as one. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo extends Bar {
     *     public Foo() {
     *         super();
     * 
     *         // this constructor only has 1 NCSS lines
     *         super.foo();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String NCSS_CONSTRUCTOR_COUNT                            = "NcssConstructorCount";

    /**
     * A class with too many methods is probably a good suspect for refactoring, in order to reduce its complexity and
     * find a way to have more fine grained objects.
     * 
     * @since PMD 4.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String TOO_MANY_METHODS                                  = "TooManyMethods";

    /**
     * Denotes whether comments are required (or unwanted) for specific language elements.
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/comments.html">PMD Comments Rule Set
     *      Documentation</a>
     */
    public static final String COMMENT_REQUIRED                                  = "CommentRequired";

    /**
     * Determines whether the dimensions of non-header comments found are within the specified limits.
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/comments.html">PMD Comments Rule Set
     *      Documentation</a>
     */
    public static final String COMMENT_SIZE                                      = "CommentSize";

    /**
     * A rule for the politically correct... we don't want to offend anyone.
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/comments.html">PMD Comments Rule Set
     *      Documentation</a>
     */
    public static final String COMMENT_CONTENT                                   = "CommentContent";

    // TODO: Add controversial rule set constants: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/controversial.html

    /**
     * This rule counts the number of unique attributes, local variables, and return types within an object. A number
     * higher than the specified threshold can indicate a high degree of coupling. <h2>Example</h2>
     * 
     * <pre>
     * import com.Blah;
     * import org.Bar;
     * import org.Bardo;
     * 
     * public class Foo {
     *    private Blah var1;
     *    private Bar var2;
     *  
     *     //followed by many imports of unique objects
     *    void ObjectC doWork() {
     *      Bardo var55;
     *      ObjectA var44;
     *      ObjectZ var93;
     *      return something;
     *    }
     * }
     * </pre>
     * 
     * @since PMD 1.04
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/coupling.html">PMD Coupling Rule Set
     *      Documentation</a>
     */
    public static final String COUPLING_BETWEEN_OBJECTS                          = "CouplingBetweenObjects";

    /**
     * A high number of imports can indicate a high degree of coupling within an object. This rule counts the number of
     * unique imports and reports a violation if the count is above the user-specified threshold. <h2>Example</h2>
     * 
     * <pre>
     * import blah.blah.Baz;
     * import blah.blah.Bif;
     * 
     * // 18 others from the same package elided
     * public class Foo {
     *     public void doWork() {
     *     }
     * }
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * </pre>
     * 
     * @since PMD 1.04
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/coupling.html">PMD Coupling Rule Set
     *      Documentation</a>
     */
    public static final String EXCESSIVE_IMPORTS                                 = "ExcessiveImports";

    /**
     * The use of implementation types as object references limits your ability to use alternate implementations in the
     * future as requirements change. Whenever available, referencing objects by their interface types provides much
     * more flexibility. <h2>Example</h2>
     * 
     * <pre>
     * // sub-optimal approach
     * public HashSet getFoo() {
     *     return new HashSet();
     * }
     * 
     * // preferred approach
     * public Set getFoo() {
     *     return new HashSet();
     * }
     * </pre>
     * 
     * @since PMD 0.7
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/coupling.html">PMD Coupling Rule Set
     *      Documentation</a>
     */
    public static final String LOOSE_COUPLING                                    = "LooseCoupling";

    /**
     * Avoid using classes from the configured package hierarchy outside of the package hierarchy, except when using one
     * of the configured allowed classes. <h2>Example</h2>
     * 
     * <pre>
     * package some.package;
     * 
     * import some.other.package.subpackage.subsubpackage.DontUseThisClass;
     * 
     * public class Bar {
     *    DontUseThisClass boo = new DontUseThisClass();
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/coupling.html">PMD Coupling Rule Set
     *      Documentation</a>
     */
    public static final String LOOSE_PACKAGE_COUPLING                            = "LoosePackageCoupling";

    /**
     * The Law of Demeter is a simple rule, that says "only talk to friends". It helps to reduce coupling between
     * classes or objects. See also the references: Andrew Hunt, David Thomas, and Ward Cunningham. The Pragmatic
     * Programmer. From Journeyman to Master. Addison-Wesley Longman, Amsterdam, October 1999.; K.J. Lieberherr and I.M.
     * Holland. Assuring good style for object-oriented programs. Software, IEEE, 6(5):38–48, 1989.;
     * http://www.ccs.neu.edu/home/lieber/LoD.html; http://en.wikipedia.org/wiki/Law_of_Demeter <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void example(final Bar b) {
     *         // this method call is ok, as b is a parameter of &quot;example&quot;
     *         final C c = b.getC();
     * 
     *         // this method call is a violation, as we are using c, which we got from B.
     *         // We should ask b directly instead, e.g. &quot;b.doItOnC();&quot;
     *         c.doIt();
     * 
     *         // this is also a violation, just expressed differently as a method chain without temporary variables.
     *         b.getC().doIt();
     * 
     *         // a constructor call, not a method call.
     *         final D d = new D();
     *         // this method call is ok, because we have create the new instance of D locally.
     *         d.doSomethingElse();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/coupling.html">PMD Coupling Rule Set
     *      Documentation</a>
     */
    public static final String LAW_OF_DEMETER                                    = "LawOfDemeter";

    // TODO: Add design rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/design.html
    // TODO: Add empty code rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/empty.html
    // TODO: Add finanlizer rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/finalizers.html
    // TODO: Add import statements rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/imports.html
    // TODO: Add J2EE rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/j2ee.html
    // TODO: Add JavaBeans rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/javabeans.html
    // TODO: Add JUnit rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/junit.html
    // TODO: Add Jakarta Commons rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/logging-jakarta-commons.html
    // TODO: Add Java logging rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/logging-java.html
    // TODO: Add migration rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/migrating.html
    // TODO: Add naming rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/naming.html
    // TODO: Add optimazation rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/optimizations.html
    // TODO: Add strict exceptions rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/strictexception.html
    // TODO: Add strings rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/strings.html
    // TODO: Add security code rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/sunsecure.html
    // TODO: Add type resolution rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/typeresolution.html
    // TODO: Add unnecessary rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/unnecessary.html
    // TODO: Add unused code rule set: http://pmd.sourceforge.net/pmd-5.0.1/rules/java/unusedcode.html

    private PMDWarnings() {
        // Constants class
    }

}
