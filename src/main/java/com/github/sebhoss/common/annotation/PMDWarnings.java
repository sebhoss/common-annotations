/* This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://www.wtfpl.net/ for more details. */
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
     * Avoid jumbled loop incrementers - its usually a mistake, and is confusing even if intentional.
     * 
     * <h2>Example</h2>
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
     * Some for loops can be simplified to while loops, this makes them more concise.
     * 
     * <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     void bar() {
     *         for (;true;) true; // No Init or Update part, may as well be: while (true)
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.02
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.1/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String FOR_LOOP_SHOULD_BE_WHILE_LOOP                     = "ForLoopShouldBeWhileLoop";

    /**
     * Override both public boolean Object.equals(Object other), and public int Object.hashCode(), or override neither.
     * Even if you are inheriting a hashCode() from a parent class, consider implementing hashCode and explicitly
     * delegating to your superclass.
     * 
     * <h2>Example</h2>
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
     * to.
     * 
     * <h2>Example</h2>
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
     * Avoid returning from a finally block, this can discard exceptions.
     * 
     * <h2>Example</h2>
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
     * Do not use "if" statements whose conditionals are always true or always false.
     * 
     * <h2>Example</h2>
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
     * instead.
     * 
     * <h2>Example</h2> </br> <code>
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
     * short-circuit operator.
     * 
     * <h2>Example</h2>
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
     * the parameter of the toArray() method. Doing otherwise you will will result in a ClassCastException.
     * 
     * <h2>Example</h2>
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
     * it is generally recommended that the (String) constructor be used in preference to this one.
     * 
     * <h2>Example</h2><code></br>
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
     * the check is useless (the variable will never be "null") or it is incorrect.
     * 
     * <h2>Example</h2>
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
     * methods that are not thread-safe.
     * 
     * <h2>Example</h2>
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
     * of && or vice versa.
     * 
     * <h2>Example</h2>
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
     * BigInteger.TEN and BigDecimal (BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.TEN)
     * 
     * <h2>Example</h2><code></br>
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
     * octal value.
     * 
     * <h2>Example</h2><code></br>
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
     * is preferable.
     * 
     * <h2>Example</h2>
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
     * return is 'false', it should be handled properly.
     * 
     * <h2>Example</h2><code></br>
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
     * bug, or consider simplifying the expression.
     * 
     * <h2>Example</h2> <code></br>
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
     * No need to explicitly extend Object.
     * 
     * <h2>Example</h2>
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
     * was the case or not.
     * 
     * <h2>Example</h2>
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
     * is not a bug, or consider using another approach.
     * 
     * <h2>Example</h2>
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
     * Thread.start() for the intended behavior.
     * 
     * <h2>Example</h2><code></br>
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
     * float provides enough precision and you have a compelling performance need (space or time).
     * 
     * <h2>Example</h2>
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

    private PMDWarnings() {
        // Constants class
    }

}
