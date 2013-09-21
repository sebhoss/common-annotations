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
 *      href="http://pmd.sourceforge.net/pmd-5.0.5/suppressing.html">http://pmd.sourceforge.net/pmd-5.0.5/suppressing.html</a>
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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String JUMBLED_INCREMENTER                               = "PMD.JumbledIncrementer";

    /**
     * Some for loops can be simplified to while loops, this makes them more concise. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     void bar() {
     *         // No Init or Update part, may as well be: while (true)
     *         for (; true;) {
     *             // do stuff..
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.02
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String FOR_LOOP_SHOULD_BE_WHILE_LOOP                     = "PMD.ForLoopShouldBeWhileLoop";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String OVERRIDE_BOTH_EQUALS_AND_HASHCODE                 = "PMD.OverrideBothEqualsAndHashcode";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String DOUBLE_CHECKED_LOCKING                            = "PMD.DoubleCheckedLocking";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String RETURN_FROM_FINALLY_BLOCK                         = "PMD.ReturnFromFinallyBlock";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String UNCONDITIONAL_IF_STATEMENT                        = "PMD.UnconditionalIfStatement";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String BOOLEAN_INSTANTIATION                             = "PMD.BooleanInstantiation";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String COLLAPSIBLE_IF_STATEMENTS                         = "PMD.CollapsibleIfStatements";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String CLASS_CAST_EXCEPTION_WITH_TO_ARRAY                = "PMD.ClassCastExceptionWithToArray";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_DECIMAL_LITERALS_IN_BIG_DECIMAL_CONSTRUCTOR = "PMD.AvoidDecimalLiteralsInBigDecimalConstructor";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String MISPLACED_NULL_CHECK                              = "PMD.MisplacedNullCheck";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_THREAD_GROUP                                = "PMD.AvoidThreadGroup";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String BROKEN_NULL_CHECK                                 = "PMD.BrokenNullCheck";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String BIG_INTEGER_INSTANTIATION                         = "PMD.BigIntegerInstantiation";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_USING_OCTAL_VALUES                          = "PMD.AvoidUsingOctalValues";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_USING_HARD_CODED_IP                         = "PMD.AvoidUsingHardCodedIP";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String CHECK_RESULT_SET                                  = "PMD.CheckResultSet";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_MULTIPLE_UNARY_OPERATORS                    = "PMD.AvoidMultipleUnaryOperators";

    /**
     * No need to explicitly extend Object. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo extends Object { // not required
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String EXTENDS_OBJECT                                    = "PMD.ExtendsObject";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String CHECK_SKIP_RESULT                                 = "PMD.CheckSkipResult";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_BRANCHING_STATEMENT_AS_LAST_IN_LOOP         = "PMD.AvoidBranchingStatementAsLastInLoop";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String DONT_CALL_THREAD_RUN                              = "PMD.DontCallThreadRun";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String DONT_USE_FLOAT_TYPE_FOR_LOOP_INDICES              = "PMD.DontUseFloatTypeForLoopIndices";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/braces.html">PMD Braces Rule Set Documentation</a>
     */
    public static final String IF_STMTS_MUST_USE_BRACES                          = "PMD.IfSTmtsMustUseBraces";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/braces.html">PMD Braces Rule Set Documentation</a>
     */
    public static final String WHILE_LOOPS_MUST_USE_BRACES                       = "PMD.WhileLoopsMustUseBraces";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/braces.html">PMD Braces Rule Set Documentation</a>
     */
    public static final String IF_ELSE_STATEMENTS_MUST_USE_BRACES                = "PMD.IfElseStmtsMustUseBraces";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/braces.html">PMD Braces Rule Set Documentation</a>
     */
    public static final String FOR_LOOPS_MUST_USE_BRACES                         = "PMD.ForLoopsMustUseBraces";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/clone.html">PMD Clone Implementation Rule Set
     *      Documentation</a>
     */
    public static final String PROPER_CLONE_IMPLEMENTATION                       = "PMD.ProperCloneImplementation";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/clone.html">PMD Clone Implementation Rule Set
     *      Documentation</a>
     */
    public static final String CLONE_THROWS_CLONE_NOT_SUPPORTED_EXCEPTION        = "PMD.CloneThrowsCloneNotSupportedException";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/clone.html">PMD Clone Implementation Rule Set
     *      Documentation</a>
     */
    public static final String CLONE_METHOD_MUST_IMPLEMENT_CLONEABLE             = "PMD.CloneMethodMustImplementCloneable";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String NPATH_COMPLEXITY                                  = "PMD.NPathComplexity";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String EXCESSIVE_METHOD_LENGTH                           = "PMD.ExcessiveMethodLength";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String EXCESSIVE_PARAMETER_LIST                          = "PMD.ExcessiveParameterList";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String EXCESSIVE_CLASS_LENGTH                            = "PMD.ExcessiveClassLength";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String CYCLOMATIC_COMPLEXITY                             = "PMD.CyclomaticComplexity";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String EXCESSIVE_PUBLIC_COUNT                            = "PMD.ExcessivePublicCount";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String TOO_MANY_FIELDS                                   = "PMD.TooManyFields";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String NCSS_METHOD_COUNT                                 = "PMD.NcssMethodCount";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String NCSS_TYPE_COUNT                                   = "PMD.NcssTypeCount";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String NCSS_CONSTRUCTOR_COUNT                            = "PMD.NcssConstructorCount";

    /**
     * A class with too many methods is probably a good suspect for refactoring, in order to reduce its complexity and
     * find a way to have more fine grained objects.
     * 
     * @since PMD 4.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String TOO_MANY_METHODS                                  = "PMD.TooManyMethods";

    /**
     * Denotes whether comments are required (or unwanted) for specific language elements.
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/comments.html">PMD Comments Rule Set
     *      Documentation</a>
     */
    public static final String COMMENT_REQUIRED                                  = "PMD.CommentRequired";

    /**
     * Determines whether the dimensions of non-header comments found are within the specified limits.
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/comments.html">PMD Comments Rule Set
     *      Documentation</a>
     */
    public static final String COMMENT_SIZE                                      = "PMD.CommentSize";

    /**
     * A rule for the politically correct... we don't want to offend anyone.
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/comments.html">PMD Comments Rule Set
     *      Documentation</a>
     */
    public static final String COMMENT_CONTENT                                   = "PMD.CommentContent";

    /**
     * This rule detects when a constructor is not necessary; i.e., when there is only one constructor, its public, has
     * an empty body, and takes no arguments. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public Foo() {
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String UNNECESSARY_CONSTRUCTOR                           = "PMD.UnnecessaryConstructor";

    /**
     * Assigning a "null" to a variable (outside of its declaration) is usually bad form. Sometimes, this type of
     * assignment is an indication that the programmer doesn't completely understand what is going on in the code. NOTE:
     * This sort of assignment may used in some cases to dereference objects and encourage garbage collection. <h2>
     * Example</h2>
     * 
     * <pre>
     * public void bar() {
     *     Object x = null; // this is OK
     *     x = new Object();
     *     // big, complex piece of code here
     *     x = null; // this is not required
     *     // big, complex piece of code here
     * }
     * </pre>
     * 
     * @since PMD 1.02
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String NULL_ASSIGNMENT                                   = "PMD.NullAssignment";

    /**
     * A method should have only one exit point, and that should be the last statement in the method. <h2>Example</h2>
     * 
     * <pre>
     * public class OneReturnOnly1 {
     *     public void foo(int x) {
     *         if (x &gt; 0) {
     *             return &quot;hey&quot;; // first exit
     *         }
     *         return &quot;hi&quot;; // second exit
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String ONLY_ONE_RETURN                                   = "PMD.OnlyOneReturn";

    /**
     * Avoid assignments in operands; this can make code more complicated and harder to read. <h2>Example</h2>
     * 
     * <pre>
     * public void bar() {
     *     int x = 2;
     *     if ((x = getX()) == 3) {
     *         System.out.println(&quot;3!&quot;);
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.03
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String ASSIGNMENT_IN_OPERAND                             = "PMD.AssignmentInOperand";

    /**
     * Each class should declare at least one constructor. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *    // missing constructor
     *   public void doSomething() { ... }
     *   public void doOtherThing { ... }
     * }
     * </pre>
     * 
     * @since PMD 1.04
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String AT_LEAST_ONE_CONSTRUCTOR                          = "PMD.AtLeastOneConstructor";

    /**
     * Avoid importing anything from the 'sun.*' packages. These packages are not portable and are likely to change. <h2>
     * Example</h2>
     * 
     * <pre>
     * import sun.misc.foo;
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String DONT_IMPORT_SUN                                   = "PMD.DontImportSun";

    /**
     * A suspicious octal escape sequence was found inside a String literal. The Java language specification (section
     * 3.10.6) says an octal escape sequence inside a literal String shall consist of a backslash followed by:
     * OctalDigit | OctalDigit OctalDigit | ZeroToThree OctalDigit OctalDigit Any octal escape sequence followed by
     * non-octal digits can be confusing, e.g. "\038" is interpreted as the octal escape sequence "\03" followed by the
     * literal character "8". <h2>Example</h2>
     * 
     * <pre>
     * public void foo() {
     *     // interpreted as octal 12, followed by character '8'
     *     System.out.println(&quot;suspicious: \128&quot;);
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String SUSPICIOUS_OCTAL_ESCAPE                           = "PMD.SuspiciousOctalEscape";

    /**
     * It is a good practice to call super() in a constructor. If super() is not called but another constructor (such as
     * an overloaded constructor) is called, this rule will not report it. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo extends Bar {
     *     public Foo() {
     *         // call the constructor of Bar
     *         super();
     *     }
     * 
     *     public Foo(int code) {
     *         // do something with code
     *         this();
     *         // no problem with this
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String CALL_SUPER_IN_CONSTRUCTOR                         = "PMD.CallSuperInConstructor";

    /**
     * Sometimes expressions are wrapped in unnecessary parentheses, making them look like function calls. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     boolean bar() {
     *         return (true);
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String UNNECESSARY_PARENTHESES                           = "PMD.UnnecessaryParentheses";

    /**
     * Use explicit scoping instead of the default package private level.
     * 
     * @since PMD 3.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String DEFAULT_PACKAGE                                   = "PMD.DefaultPackage";

    /**
     * Use bitwise inversion to invert boolean values - it's the fastest way to do this. See
     * http://www.javaspecialists.co.za/archive/newsletter.do?issue=042&locale=en_US for specific details <h2>Example</h2>
     * 
     * <pre>
     * boolean b = true;
     * b = !b; // slow
     * b &circ;= true; // fast
     * </pre>
     * 
     * @since PMD 3.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String BOOLEAN_INVERSION                                 = "PMD.BooleanInversion";

    /**
     * The dataflow analysis tracks local definitions, undefinitions and references to variables on different paths on
     * the data flow. From those informations there can be found various problems. 1. UR - Anomaly: There is a reference
     * to a variable that was not defined before. This is a bug and leads to an error. 2. DU - Anomaly: A recently
     * defined variable is undefined. These anomalies may appear in normal source text. 3. DD - Anomaly: A recently
     * defined variable is redefined. This is ominous but don't have to be a bug. <h2>Example</h2>
     * 
     * <pre>
     * public void foo() {
     *     int buz = 5;
     *     buz = 6; // redefinition of buz -&gt; dd-anomaly
     *     foo(buz);
     *     buz = 2;
     * } // buz is undefined when leaving scope -&gt; du-anomaly
     * </pre>
     * 
     * @since PMD 3.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String DATAFLOW_ANOMALY_ANALYSIS                         = "PMD.DataflowAnomalyAnalysis";

    /**
     * Avoid using final local variables, turn them into fields. <h2>Example</h2>
     * 
     * <pre>
     * public class MyClass {
     *     public void foo() {
     *         final String finalLocalVariable;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_FINAL_LOCAL_VARIABLE                        = "PMD.AvoidFinalLocalVariable";

    /**
     * Java uses the 'short' type to reduce memory usage, not to optimize calculation. In fact, the JVM does not have
     * any arithmetic capabilities for the short type: the JVM must convert the short into an int, do the proper
     * calculation and convert the int back to a short. Thus any storage gains found through use of the 'short' type may
     * be offset by adverse impacts on performance. <h2>Example</h2>
     * 
     * <pre>
     * public class UsingShort {
     *     private short doNotUseShort = 0;
     * 
     *     public UsingShort() {
     *         short shouldNotBeUsed = 1;
     *         doNotUseShort += shouldNotBeUsed;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_USING_SHORT_TYPE                            = "PMD.AvoidUsingShortType";

    /**
     * Use of the keyword 'volatile' is generally used to fine tune a Java application, and therefore, requires a good
     * expertise of the Java Memory Model. Moreover, its range of action is somewhat misknown. Therefore, the volatile
     * keyword should not be used for maintenance purpose and portability. <h2>Example</h2>
     * 
     * <pre>
     * public class ThrDeux {
     *     private volatile String var1; // not suggested
     *     private String          var2; // preferred
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_USING_VOLATILE                              = "PMD.AvoidUsingVolatile";

    /**
     * Unnecessary reliance on Java Native Interface (JNI) calls directly reduces application portability and increases
     * the maintenance burden. <h2>Example</h2>
     * 
     * <pre>
     * public class SomeJNIClass {
     * 
     *     public SomeJNIClass() {
     *         System.loadLibrary(&quot;nativelib&quot;);
     *     }
     * 
     *     static {
     *         System.loadLibrary(&quot;nativelib&quot;);
     *     }
     * 
     *     public void invalidCallsInMethod() throws SecurityException, NoSuchMethodException {
     *         System.loadLibrary(&quot;nativelib&quot;);
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_USING_NATIVE_CODE                           = "PMD.AvoidUsingNativeCode";

    /**
     * Methods such as getDeclaredConstructors(), getDeclaredConstructor(Class[]) and setAccessible(), as the interface
     * PrivilegedAction, allows for the runtime alteration of variable, class, or method visibility, even if they are
     * private. This violates the principle of encapsulation. <h2>Example</h2>
     * 
     * <pre>
     * public class Violation {
     *     public void invalidCallsInMethod() throws SecurityException, NoSuchMethodException {
     *         // Possible call to forbidden getDeclaredConstructors
     *         Class[] arrayOfClass = new Class[1];
     *         this.getClass().getDeclaredConstructors();
     *         this.getClass().getDeclaredConstructor(arrayOfClass);
     *         Class clazz = this.getClass();
     *         clazz.getDeclaredConstructor(arrayOfClass);
     *         clazz.getDeclaredConstructors();
     *         // Possible call to forbidden setAccessible
     *         clazz.getMethod(&quot;&quot;, arrayOfClass).setAccessible(false);
     *         AccessibleObject.setAccessible(null, false);
     *         Method.setAccessible(null, false);
     *         Method[] methodsArray = clazz.getMethods();
     *         int nbMethod;
     *         for (nbMethod = 0; nbMethod &lt; methodsArray.length; nbMethod++) {
     *             methodsArray[nbMethod].setAccessible(false);
     *         }
     * 
     *         // Possible call to forbidden PrivilegedAction
     *         PrivilegedAction priv = (PrivilegedAction) new Object();
     *         priv.run();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_ACCESSIBILITY_ALTERATION                    = "PMD.AvoidAccessibilityAlteration";

    /**
     * Calls to System.gc(), Runtime.getRuntime().gc(), and System.runFinalization() are not advised. Code should have
     * the same behavior whether the garbage collection is disabled using the option -Xdisableexplicitgc or not.
     * Moreover, "modern" jvms do a very good job handling garbage collections. If memory usage issues unrelated to
     * memory leaks develop within an application, it should be dealt with JVM options rather than within the code
     * itself. <h2>Example</h2>
     * 
     * <pre>
     * public class GCCall {
     *     public GCCall() {
     *         // Explicit gc call !
     *         System.gc();
     *     }
     * 
     *     public void doSomething() {
     *     // Explicit gc call !
     *        Runtime.getRuntime().gc();
     *     }
     * 
     *     public explicitGCcall() { // Explicit gc call ! System.gc(); }
     * 
     *     public void doSomething() { // Explicit gc call ! Runtime.getRuntime().gc(); }
     * }
     * </pre>
     * 
     * @since PMD 4.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String DO_NOT_CALL_GARBAGE_COLLECTION_EXPLICITLY         = "PMD.DoNotCallGarbageCollectionExplicitly";

    /**
     * Java allows the use of several variables declaration of the same type on one line. However, it can lead to quite
     * messy code. This rule looks for several declarations on the same line. <h2>Example</h2>
     * 
     * <pre>
     * public class OneDeclaration {
     *     String name, lastname; // combined declaration, a violation
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String ONE_DECLARATION_PER_LINE                          = "PMD.OneDeclarationPerLine";

    /**
     * Prefixing parameters by 'in' or 'out' pollutes the name of the parameters and reduces code readability. To
     * indicate whether or not a parameter will be modify in a method, its better to document method behavior with
     * Javadoc. <h2>Example</h2>
     * 
     * <pre>
     * // Not really clear
     * public class Foo {
     *     public void bar(
     *             int inLeftOperand,
     *             Result outRightOperand) {
     *         outRightOperand.setValue(inLeftOperand * outRightOperand.getValue());
     *     }
     * }
     * 
     * // Far more useful
     * public class Foo {
     *     public void bar(
     *             final int leftOperand,
     *             final Result rightOperand) {
     *         rightOperand.setValue(leftOperand * rightOperand.getValue());
     *     }
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_PREFIXING_METHOD_PARAMETERS                 = "PMD.AvoidPrefixingMethodParameters";

    /**
     * Avoid using hard-coded literals in conditional statements. By declaring them as static variables or private
     * members with descriptive names maintainability is enhanced. <h2>Example</h2>
     * 
     * <pre>
     * public class Literals {
     *     private static final int TEN = 10;
     * 
     *     public void downCastPrimitiveType() {
     * 
     *         if (i == 10) { // magic number, buried in a method
     *             doSomething();
     *         }
     * 
     *         if (i == TEN) { // preferred approach
     *             doSomething();
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.2.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_LITERALS_IN_IF_CONDITION                    = "PMD.AvoidLiteralsInIfCondition";

    /**
     * When you write a public method, you should be thinking in terms of an API. If your method is public, it means
     * other class will use it, therefore, you want (or need) to offer a comprehensive and evolutive API. If you pass a
     * lot of information as a simple series of Strings, you may think of using an Object to represent all those
     * information. You'll get a simplier API (such as doWork(Workload workload), rather than a tedious series of
     * Strings) and more importantly, if you need at some point to pass extra data, you'll be able to do so by simply
     * modifying or extending Workload without any modification to your API. <h2>Example</h2>
     * 
     * <pre>
     * public class MyClass {
     *     public void connect(String username,
     *             String pssd,
     *             String databaseName,
     *             String databaseAdress)
     *     // Instead of those parameters object
     *     // would ensure a cleaner API and permit
     *     // to add extra data transparently (no code change):
     *     // void connect(UserData data);
     *     {
     * 
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.2.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String USE_OBJECT_FOR_CLEARER_API                        = "PMD.UseObjectForClearerAPI";

    /**
     * Since Java5 brought a new implementation of the Map designed for multi-threaded access, you can perform efficient
     * map reads without blocking other threads. <h2>Example</h2>
     * 
     * <pre>
     * public class ConcurrentApp {
     *     public void getMyInstance() {
     *         Map map1 = new HashMap(); // fine for single-threaded access
     *         Map map2 = new ConcurrentHashMap(); // preferred for use with multiple threads
     * 
     *         // the following case will be ignored by this rule
     *         Map map3 = someModule.methodThatReturnMap(); // might be OK, if the returned map is already thread-safe
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.2.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String USE_CONCURRENT_HASH_MAP                           = "PMD.UseConcurrentHashMap";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/coupling.html">PMD Coupling Rule Set
     *      Documentation</a>
     */
    public static final String COUPLING_BETWEEN_OBJECTS                          = "PMD.CouplingBetweenObjects";

    /**
     * A high number of imports can indicate a high degree of coupling within an object. This rule counts the number of
     * unique imports and reports a violation if the count is above the user-specified threshold. <h2>Example</h2>
     * 
     * <pre>
     * import blah.blah.Baz;
     * // 18 others from the same package elided
     * import blah.blah.Bif;
     * </pre>
     * 
     * @since PMD 1.04
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/coupling.html">PMD Coupling Rule Set
     *      Documentation</a>
     */
    public static final String EXCESSIVE_IMPORTS                                 = "PMD.ExcessiveImports";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/coupling.html">PMD Coupling Rule Set
     *      Documentation</a>
     */
    public static final String LOOSE_COUPLING                                    = "PMD.LooseCoupling";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/coupling.html">PMD Coupling Rule Set
     *      Documentation</a>
     */
    public static final String LOOSE_PACKAGE_COUPLING                            = "PMD.LoosePackageCoupling";

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
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/coupling.html">PMD Coupling Rule Set
     *      Documentation</a>
     */
    public static final String LAW_OF_DEMETER                                    = "PMD.LawOfDemeter";

    // TODO: Add design rule set: http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html

    /**
     * Empty Catch Block finds instances where an exception is caught, but nothing is done. In most circumstances, this
     * swallows an exception which should either be acted on or reported. <h2>Example</h2>
     * 
     * <pre>
     * public void doSomething() {
     *     try {
     *         FileInputStream fis = new FileInputStream(&quot;/tmp/bugger&quot;);
     *     } catch (IOException ioe) {
     *         // not good
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_CATCH_BLOCK                                 = "PMD.EmptyCatchBlock";

    /**
     * Empty If Statement finds instances where a condition is checked but nothing is done about it. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     void bar(int x) {
     *         if (x == 0) {
     *             // empty!
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_IF_STATEMENT                                = "PMD.EmptyIfStmt";

    /**
     * Empty While Statement finds all instances where a while statement does nothing. If it is a timing loop, then you
     * should use Thread.sleep() for it; if it is a while loop that does a lot in the exit expression, rewrite it to
     * make it clearer. <h2>Example</h2>
     * 
     * <pre>
     * void bar(int a, int b) {
     *     while (a == b) {
     *         // empty!
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_WHILE_STATEMENT                             = "PMD.EmptyWhileStmt";

    /**
     * Avoid empty try blocks - what's the point? <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void bar() {
     *         try {
     *         } catch (Exception e) {
     *             e.printStackTrace();
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_TRY_BLOCK                                   = "PMD.EmptyTryBlock";

    /**
     * Empty finally blocks serve no purpose and should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void bar() {
     *         try {
     *             int x = 2;
     *         } finally {
     *             // empty!
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_FINALLY_BLOCK                               = "PMD.EmptyFinallyBlock";

    /**
     * Empty switch statements serve no purpose and should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public void bar() {
     *     int x = 2;
     *     switch (x) {
     *     // once there was code here
     *     // but it's been commented out or something
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_SWITCH_STATEMENTS                           = "PMD.EmptySwitchStatements";

    /**
     * Empty synchronized blocks serve no purpose and should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void bar() {
     *         synchronized (this) {
     *             // empty!
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_SYNCHRONIZED_BLOCK                          = "PMD.EmptySynchronizedBlock";

    /**
     * An empty statement (or a semicolon by itself) that is not used as the sole body of a 'for' or 'while' loop is
     * probably a bug. It could also be a double semicolon, which has no purpose and should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public void doit() {
     *     // this is probably not what you meant to do
     *     ;
     *     // the extra semicolon here this is not necessary
     *     System.out.println(&quot;look at the extra semicolon&quot;);
     *     ;
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_STATEMENT_NOT_IN_LOOP                       = "PMD.EmptyStatementNotInLoop";

    /**
     * Empty initializers serve no purpose and should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     * 
     *     static {
     *     } // Why ?
     * 
     *     {
     *     } // Again, why ?
     * 
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_INITIALIZER                                 = "PMD.EmptyInitializer";

    /**
     * Empty block statements serve no purpose and should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     * 
     *     private int _bar;
     * 
     *     public void setBar(int bar) {
     *         {
     *             _bar = bar;
     *         } // Why not?
     *         {
     *         } // But remove this.
     *     }
     * 
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_STATEMENT_BLOCK                             = "PMD.EmptyStatementBlock";

    /**
     * An empty static initializer serve no purpose and should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     static {
     *         // empty
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_STATIC_INITIALIZER                          = "PMD.EmptyStaticInitializer";

    /**
     * Empty finalize methods serve no purpose and should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     protected void finalize() {
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/finalizers.html">PMD Finalizers Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_FINANLIZER                                  = "PMD.EmptyFinalizer";

    /**
     * If the finalize() is implemented, it should do something besides just calling super.finalize(). <h2>Example</h2>
     * 
     * <pre>
     * protected void finalize() {
     *     super.finalize();
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/finalizers.html">PMD Finalizers Rule Set
     *      Documentation</a>
     */
    public static final String FINALIZE_ONLY_CALLS_SUPER_FINALIZE                = "PMD.FinalizeOnlyCallsSuperFinalize";

    /**
     * Methods named finalize() should not have parameters. It is confusing and most likely an attempt to overload
     * Object.finalize(). It will not be called by the VM. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     // this is confusing and probably a bug
     *     protected void finalize(int a) {
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/finalizers.html">PMD Finalizers Rule Set
     *      Documentation</a>
     */
    public static final String FINALIZE_OVERLOADED                               = "PMD.FinalizeOverloaded";

    /**
     * If the finalize() is implemented, its last action should be to call super.finalize. <h2>Example</h2>
     * 
     * <pre>
     * protected void finalize() {
     *     something();
     *     // neglected to call super.finalize()
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/finalizers.html">PMD Finalizers Rule Set
     *      Documentation</a>
     */
    public static final String FINALIZE_DOES_NOT_CALL_SUPER_FINALIZE             = "PMD.FinalizeDoesNotCallSuperFinalize";

    /**
     * When overriding the finalize(), the new method should be set as protected. If made public, other classes may
     * invoke it at inappropriate times. <h2>Example</h2>
     * 
     * <pre>
     * public void finalize() {
     *     // do something
     * }
     * </pre>
     * 
     * @since PMD 1.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/finalizers.html">PMD Finalizers Rule Set
     *      Documentation</a>
     */
    public static final String FINALIZE_SHOULD_BE_PROTECTED                      = "PMD.FinalizeShouldBeProtected";

    /**
     * The method Object.finalize() is called by the garbage collector on an object when garbage collection determines
     * that there are no more references to the object. It should not be invoked by application logic. <h2>Example</h2>
     * 
     * <pre>
     * void foo() {
     *     Bar b = new Bar();
     *     b.finalize();
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/finalizers.html">PMD Finalizers Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_CALLING_FINALIZE                            = "PMD.AvoidCallingFinalize";

    /**
     * Duplicate or overlapping import statements should be avoided. <h2>Example</h2>
     * 
     * <pre>
     * import java.lang.String;
     * import java.lang.*;
     * </pre>
     * 
     * @since PMD 0.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/imports.html">PMD Import Statements Rule Set
     *      Documentation</a>
     */
    public static final String DUPLICATE_IMPORTS                                 = "PMD.DuplicateImports";

    /**
     * Avoid importing anything from the package 'java.lang'. These classes are automatically imported (JLS 7.5.3). <h2>
     * Example</h2>
     * 
     * <pre>
     * import java.lang.String; // this is unnecessary
     * import java.lang.*; // this is bad
     * </pre>
     * 
     * @since PMD 0.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/imports.html">PMD Import Statements Rule Set
     *      Documentation</a>
     */
    public static final String DONT_IMPORT_JAVA_LANG                             = "PMD.DontImportJavaLang";

    /**
     * Avoid the use of unused import statements to prevent unwanted dependencies. <h2>Example</h2>
     * 
     * <pre>
     * // this is bad, if the class doesn't use java.io.File
     * import java.io.File;
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/imports.html">PMD Import Statements Rule Set
     *      Documentation</a>
     */
    public static final String UNUSED_IMPORTS                                    = "PMD.UnusedImports";

    /**
     * There is no need to import a type that lives in the same package. <h2>Example</h2>
     * 
     * <pre>
     * package foo;
     * 
     * import foo.Buz; // no need for this
     * import foo.*; // or this
     * </pre>
     * 
     * @since PMD 1.02
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/imports.html">PMD Import Statements Rule Set
     *      Documentation</a>
     */
    public static final String IMPORT_FROM_SAME_PACKAGE                          = "PMD.ImportFromSamePackage";

    /**
     * If you overuse the static import feature, it can make your program unreadable and unmaintainable, polluting its
     * namespace with all the static members you import. Readers of your code (including you, a few months after you
     * wrote it) will not know which class a static member comes from (Sun 1.5 Language Guide). <h2>Example</h2>
     * 
     * <pre>
     * import static Lennon;
     * import static Ringo;
     * import static George;
     * import static Paul;
     * import static Yoko; // Too much !
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/imports.html">PMD Import Statements Rule Set
     *      Documentation</a>
     */
    public static final String TOO_MANY_STATIC_IMPORTS                           = "PMD.TooManyStaticImports";

    /**
     * Import statements allow the use of non-fully qualified names. The use of a fully qualified name which is covered
     * by an import statement is redundant. Consider using the non-fully qualified name. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private java.util.List list1; // Unnecessary FQN
     *     private List           list2; // More appropriate given import of 'java.util.List'
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/imports.html">PMD Import Statements Rule Set
     *      Documentation</a>
     */
    public static final String UNNECESSARY_FULLY_QUALIFIED_NAME                  = "PMD.UnnecessaryFullyQualifiedName";

    /**
     * In J2EE, the getClassLoader() method might not work as expected. Use
     * Thread.currentThread().getContextClassLoader() instead. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     ClassLoader cl = Bar.class.getClassLoader();
     * }
     * </pre>
     * 
     * @since PMD 3.7
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String USE_PROPER_CLASS_LOADER                           = "PMD.UseProperClassLoader";

    /**
     * The EJB Specification states that any MessageDrivenBean or SessionBean should be suffixed by 'Bean'. <h2>Example</h2>
     * 
     * <pre>
     * public class SomeBean implements SessionBean {
     * } // proper name
     * 
     * public class MissingTheProperSuffix implements SessionBean {
     * } // non-standard name
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String MDB_AND_SESSION_BEAN_NAMING_CONVENTION            = "PMD.MDBAndSessionBeanNamingConvention";

    /**
     * A Remote Home interface type of a Session EJB should be suffixed by 'Home'. <h2>Example</h2>
     * 
     * <pre>
     * public interface MyBeautifulHome extends javax.ejb.EJBHome {
     * } // proper name
     * 
     * public interface MissingProperSuffix extends javax.ejb.EJBHome {
     * } // non-standard name
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String REMOTE_SESSION_INTERFACE_NAMING_CONVENTION        = "PMD.RemoteSessionInterfaceNamingConvention";

    /**
     * The Local Interface of a Session EJB should be suffixed by 'Local'. <h2>Example</h2>
     * 
     * <pre>
     * public interface MyLocal extends javax.ejb.EJBLocalObject {
     * } // proper name
     * 
     * public interface MissingProperSuffix extends javax.ejb.EJBLocalObject {
     * } // non-standard name
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String LOCAL_INTERFACE_SESSION_NAMING_CONVENTION         = "PMD.LocalInterfaceSessionNamingConvention";

    /**
     * The Local Home interface of a Session EJB should be suffixed by 'LocalHome'. <h2>Example</h2>
     * 
     * <pre>
     * public interface MyBeautifulLocalHome extends javax.ejb.EJBLocalHome {
     * }// proper name
     * 
     * public interface MissingProperSuffix extends javax.ejb.EJBLocalHome {
     * } // non-standard name
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String LOCAL_HOME_NAMING_CONVENTION                      = "PMD.LocalHomeNamingConvention";

    /**
     * Remote Interface of a Session EJB should not have a suffix. <h2>Example</h2>
     * 
     * <pre>
     * // Poor Session suffix
     * public interface BadSuffixSession extends javax.ejb.EJBObject {
     * }
     * 
     * // Poor EJB suffix
     * public interface BadSuffixEJB extends javax.ejb.EJBObject {
     * }
     * 
     * // Poor Bean suffix
     * public interface BadSuffixBean extends javax.ejb.EJBObject {
     * }
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String REMOTE_INTERFACE_NAMING_CONVENTION                = "PMD.RemoteInterfaceNamingConvention";

    /**
     * Web applications should not call System.exit(), since only the web container or the application server should
     * stop the JVM. This rule also checks for the equivalent call Runtime.getRuntime().exit(). <h2>Example</h2>
     * 
     * <pre>
     * public void bar() {
     *     System.exit(0); // never call this when running in an application server!
     * }
     * 
     * public void foo() {
     *     Runtime.getRuntime().exit(0); // never stop the JVM manually, the container will do this.
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String DO_NOT_CALL_SYSTEM_EXIT                           = "PMD.DoNotCallSystemExit";

    /**
     * According to the J2EE specification, an EJB should not have any static fields with write access. However, static
     * read-only fields are allowed. This ensures proper behavior especially when instances are distributed by the
     * container on several JREs. <h2>Example</h2>
     * 
     * <pre>
     * public class SomeEJB extends EJBObject implements EJBLocalHome {
     * 
     *     private static int       CountA; // poor, field can be edited
     * 
     *     private static final int CountB; // preferred, read-only access
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String STATIC_EJB_FIELD_SHOULD_BE_FINAL                  = "PMD.StaticEJBFieldShouldBeFinal";

    /**
     * The J2EE specification explicitly forbids the use of threads. <h2>Example</h2>
     * 
     * <pre>
     * // This is not allowed
     * public class UsingThread extends Thread {
     * 
     * }
     * 
     * // Neither this,
     * public class OtherThread implements Runnable {
     *     // Nor this ...
     *     public void methode() {
     *         Runnable thread = new Thread();
     *         thread.run();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String DO_NOT_USE_THREADS                                = "PMD.DoNotUseThreads";

    /**
     * If a class is a bean, or is referenced by a bean directly or indirectly it needs to be serializable. Member
     * variables need to be marked as transient, static, or have accessor methods in the class. Marking variables as
     * transient is the safest and easiest modification. Accessor methods should follow the Java naming conventions,
     * i.e. for a variable named foo, getFoo() and setFoo() accessor methods should be provided. <h2>Example</h2>
     * 
     * <pre>
     * public class Serialized {
     *     private transient int someFoo; // good, it's transient
     *     private static int    otherFoo; // also OK
     *     private int           moreFoo; // OK, has proper accessors, see below
     *     private int           badFoo;  // bad, should be
     *                                     // marked transient
     * 
     *     private void setMoreFoo(
     *             int moreFoo) {
     *         this.moreFoo = moreFoo;
     *     }
     * 
     *     private int getMoreFoo() {
     *         return this.moreFoo;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/javabeans.html">PMD JavaBeans Rule Set
     *      Documentation</a>
     */
    public static final String BEAN_MEMBERS_SHOULD_SERIALIZE                     = "PMD.BeanMembersShouldSerialize";

    /**
     * Serializable classes should provide a serialVersionUID field. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo implements java.io.Serializable {
     *     String name;
     *     // Define serialization id to avoid serialization related bugs
     *     // i.e., public static final long serialVersionUID = 4328743;
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/javabeans.html">PMD JavaBeans Rule Set
     *      Documentation</a>
     */
    public static final String MISSING_SERIAL_VERSION_UID                        = "PMD.MissingSerialVersionUID";

    // TODO: Add JUnit rule set: http://pmd.sourceforge.net/pmd-5.0.5/rules/java/junit.html
    // TODO: Add Jakarta Commons rule set: http://pmd.sourceforge.net/pmd-5.0.5/rules/java/logging-jakarta-commons.html
    // TODO: Add Java logging rule set: http://pmd.sourceforge.net/pmd-5.0.5/rules/java/logging-java.html
    // TODO: Add migration rule set: http://pmd.sourceforge.net/pmd-5.0.5/rules/java/migrating.html
    // TODO: Add naming rule set: http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html
    // TODO: Add optimazation rule set: http://pmd.sourceforge.net/pmd-5.0.5/rules/java/optimizations.html
    // TODO: Add strict exceptions rule set: http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strictexception.html
    // TODO: Add strings rule set: http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strings.html

    /**
     * Exposing internal arrays to the caller violates object encapsulation since elements can be removed or replaced
     * outside of the object that owns it. It is safer to return a copy of the array. <h2>Example</h2>
     * 
     * <pre>
     * public class SecureSystem {
     *     UserData[] ud;
     * 
     *     public UserData[] getUserData() {
     *         // Don't return directly the internal array, return a copy
     *         return ud;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 2.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/sunsecure.html">PMD Security Code Guidelines Rule
     *      Set Documentation</a>
     */
    public static final String METHOD_RETURNS_INTERNAL_ARRAY                     = "PMD.MethodReturnsInternalArray";

    /**
     * Constructors and methods receiving arrays should clone objects and store the copy. This prevents future changes
     * from the user from affecting the original array. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private String[] x;
     * 
     *     public void foo(String[] param) {
     *         // Don't do this, make a copy of the array at least
     *         this.x = param;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 2.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/sunsecure.html">PMD Security Code Guidelines Rule
     *      Set Documentation</a>
     */
    public static final String ARRAY_IS_STORED_DIRECTLY                          = "PMD.ArrayIsStoredDirectly";

    /**
     * It is unclear which exceptions that can be thrown from the methods. It might be difficult to document and
     * understand the vague interfaces. Use either a class derived from RuntimeException or a checked exception. JUnit
     * classes are excluded. <h2>Example</h2>
     * 
     * <pre>
     * public void methodThrowingException() throws Exception {
     * }
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/typeresolution.html">PMD Type Resolution Rule Set
     *      Documentation</a>
     */
    public static final String SIGNATURE_DECLARE_THROWS_EXCEPTION                = "PMD.SignatureDeclareThrowsException";

    /**
     * Avoid the use temporary objects when converting primitives to Strings. Use the static conversion methods on the
     * wrapper classes instead. <h2>Example</h2>
     * 
     * <pre>
     * public String convert(int x) {
     *     String foo = new Integer(x).toString(); // this wastes an object
     * 
     *     return Integer.toString(x); // preferred approach
     * }
     * </pre>
     * 
     * @since PMD 0.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unnecessary.html">PMD Unnecessary Rule Set
     *      Documentation</a>
     */
    public static final String UNNECESSARY_CONVERSION_TEMPORARY                  = "PMD.UnnecessaryConversionTemporary";

    /**
     * Avoid the use of unnecessary return statements. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void bar() {
     *         int x = 42;
     *         return;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unnecessary.html">PMD Unnecessary Rule Set
     *      Documentation</a>
     */
    public static final String UNNECESSARY_RETURN                                = "PMD.UnnecessaryReturn";

    /**
     * When a class has the final modifier, all the methods are automatically final and do not need to be tagged as
     * such. <h2>Example</h2>
     * 
     * <pre>
     * public final class Foo {
     *     // This final modifier is not necessary, since the class is final
     *     // and thus, all methods are final
     *     private final void foo() {
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unnecessary.html">PMD Unnecessary Rule Set
     *      Documentation</a>
     */
    public static final String UNNECESSARY_FINAL_MODIFIER                        = "PMD.UnnecessaryFinalModifier";

    /**
     * The overriding method merely calls the same method defined in a superclass. <h2>Example</h2>
     * 
     * <pre>
     * public void foo(String bar) {
     *     super.foo(bar); // why bother overriding?
     * }
     * 
     * public String foo() {
     *     return super.foo(); // why bother overriding?
     * }
     * 
     * &#064;Id
     * public Long getId() {
     *     return super.getId(); // OK if 'ignoreAnnotations' is false, which is the default behavior
     * }
     * </pre>
     * 
     * @since PMD 3.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unnecessary.html">PMD Unnecessary Rule Set
     *      Documentation</a>
     */
    public static final String USELESS_OVERRIDING_METHOD                         = "PMD.UselessOverridingMethod";

    /**
     * An operation on an Immutable object (String, BigDecimal or BigInteger) won't change the object itself since the
     * result of the operation is a new object. Therefore, ignoring the operation result is an error. <h2>Example</h2>
     * 
     * <pre>
     * class Test {
     *     void method1() {
     *         BigDecimal bd = new BigDecimal(10);
     *         bd.add(new BigDecimal(5)); // this will trigger the rule
     *     }
     * 
     *     void method2() {
     *         BigDecimal bd = new BigDecimal(10);
     *         bd = bd.add(new BigDecimal(5)); // this won't trigger the rule
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unnecessary.html">PMD Unnecessary Rule Set
     *      Documentation</a>
     */
    public static final String USELESS_OPERATION_ON_IMMUTABLE                    = "PMD.UselessOperationOnImmutable";

    /**
     * After checking an object reference for null, you should invoke equals() on that object rather than passing it to
     * another object's equals() method. <h2>Example</h2>
     * 
     * <pre>
     * public class Test {
     * 
     *     public String method1() {
     *         return &quot;ok&quot;;
     *     }
     * 
     *     public String method2() {
     *         return null;
     *     }
     * 
     *     public void method(String a) {
     *         String b;
     *         // I don't know it method1() can be &quot;null&quot;
     *         // but I know &quot;a&quot; is not null..
     *         // I'd better write a.equals(method1())
     * 
     *         if (a != null &amp;&amp; method1().equals(a)) { // will trigger the rule
     *             // whatever
     *         }
     * 
     *         if (method1().equals(a) &amp;&amp; a != null) { // won't trigger the rule
     *             // whatever
     *         }
     * 
     *         if (a != null &amp;&amp; method1().equals(b)) { // won't trigger the rule
     *             // whatever
     *         }
     * 
     *         if (a != null &amp;&amp; &quot;LITERAL&quot;.equals(a)) { // won't trigger the rule
     *             // whatever
     *         }
     * 
     *         if (a != null &amp;&amp; !a.equals(&quot;go&quot;)) { // won't trigger the rule
     *             a = method2();
     *             if (method1().equals(a)) {
     *                 // whatever
     *             }
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unnecessary.html">PMD Unnecessary Rule Set
     *      Documentation</a>
     */
    public static final String UNUSED_NULL_CHECK_IN_EQUALS                       = "PMD.UnusedNullCheckInEquals";

    /**
     * Useless parentheses should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     * 
     *     private int     _bar1;
     *     private Integer _bar2;
     * 
     *     public void setBar(int n) {
     *         _bar1 = Integer.valueOf((n)); // here
     *         _bar2 = (n); // and here
     *     }
     * 
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unnecessary.html">PMD Unnecessary Rule Set
     *      Documentation</a>
     */
    public static final String USELESS_PARANTHESES                               = "PMD.UselessParentheses";

    /**
     * Detects when a private field is declared and/or assigned a value, but not used. <h2>Example</h2>
     * 
     * <pre>
     * public class Something {
     *     private static int FOO = 2; // Unused
     *     private int        i   = 5; // Unused
     *     private int        j   = 6;
     * 
     *     public int addOne() {
     *         return j++;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unusedcode.html">PMD Unused Rule Set
     *      Documentation</a>
     */
    public static final String UNUSED_PRIVATE_FIELD                              = "PMD.UnusedPrivateField";

    /**
     * Detects when a local variable is declared and/or assigned, but not used. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void doSomething() {
     *         int i = 5; // Unused
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unusedcode.html">PMD Unused Rule Set
     *      Documentation</a>
     */
    public static final String UNUSED_LOCAL_VARIABLE                             = "PMD.UnusedLocalVariable";

    /**
     * Unused Private Method detects when a private method is declared but is unused. <h2>Example</h2>
     * 
     * <pre>
     * public class Something {
     *     private void foo() {
     *     } // unused
     * }
     * </pre>
     * 
     * @since PMD 0.7
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unusedcode.html">PMD Unused Rule Set
     *      Documentation</a>
     */
    public static final String UNUSED_PRIVATE_METHOD                             = "PMD.UnusedPrivateMethod";

    /**
     * Avoid passing parameters to methods or constructors without actually referencing them in the method body. <h2>
     * Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private void bar(String howdy) {
     *         // howdy is not used
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.8
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unusedcode.html">PMD Unused Rule Set
     *      Documentation</a>
     */
    public static final String UNUSED_FORMAL_PARAMETER                           = "PMD.UnusedFormalParameter";

    /**
     * Fields in interfaces are automatically public static final, and methods are public abstract. Classes or
     * interfaces nested in an interface are automatically public and static (all nested interfaces are automatically
     * static). For historical reasons, modifiers which are implied by the context are accepted by the compiler, but are
     * superfluous. <h2>Example</h2>
     * 
     * <pre>
     * public interface Foo {
     *     public abstract void bar(); // both abstract and public are ignored by the compiler
     * 
     *     public static final int X = 0; // public, static, and final all ignored
     * 
     *     public static class Bar {
     *     } // public, static ignored
     * 
     *     public static interface Baz {
     *     } // ditto
     * }
     * 
     * public class Bar {
     *     public static interface Baz {
     *     } // static ignored
     * }
     * </pre>
     * 
     * @since PMD 1.02
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unusedcode.html">PMD Unused Rule Set
     *      Documentation</a>
     */
    public static final String UNUSED_MODIFIER                                   = "PMD.UnusedModifier";

    private PMDWarnings() {
        // Constants class
    }

}
