(ns clojure-presentation
;  (:require [clojure.string :as str]
  )

;;;;
;;;; Clojure/ClojureScript
;;;; =====================
;
; A language that doesn't affect the way you think
;   about programming, is not worth knowing.
;                                    (Alan Perlis)
;

;;;
;;; Functional Programming
;;; ======================
;
; * programming paradigm
; * uses functions as a primary programming construct
; * functions are first class citizens
;   * functions as parameters
;   * functions as return values
;   * named and anonymous functions
;
; * pure functions are referentially transparent
;   * have no side effects
;   * always return the same result for the same input
;     * can be cached, easily tested, reasoned about
;   * are composable
;   

;;;
;;; Properties of Clojure/Clojurescript
;;; ===================================
;
; Clojure is
; * a functional programming language
; * a Lisp (but with less parenthesis)
;

;;;
;;; Features
;;; ========
;
; * functional
;   * simple by design
;
; * data driven
;   * values, immutable data
;   * information, facts don't change
;
; * rich set of data literals
;   * list, vectors, sets, maps
;
; * rich set of persistent data structures
;   * performant through structural sharing
;
; * explicit state through reference types
;   * atoms for uncoordinated atomic changes
;   * refs for coordinated changes
;   * agents for asynchronous changes
;   * vars for thread local state
;
; * hosted
;   * runs on JVM, JavaScript, CLR
;     * complete access to the ecosystem of the platform
;   * runs as shell (babashka)
;

;;;
;;; Development Environments
;;; ========================
; 
; * VS Code with Calva
; * Emacs with Cider
; * IntelliJ with Cursive
; * ...
;

;;;
;;; Clojure Build Tools
;;; ===================
;
; * cjl/clojure
;   * works perfect on Linux and Macs, not so on Windows
; * Leiningen
; * Maven, Gradle, Boot, ...
;

;;;
;;; The REPL
;;; ========
;
;  +> Read -> Evaluate -> Print +
;  +------------Loop------------+
;
; * enable interactive develpment
; * gives instant feedback
;
;   => Clojure's superpower!
;

;;;
;;; Java vs. Clojure Syntax
;;; =======================
;
; Java:    calculate(a, b)
; Clojure: (calculate a b)
; 
; * list evaluation
;   * first entry is the function position
;   * function is called with the rest of the list as parameters
;
;         |  Operators	 |   Methods/Functions
; --------+--------------+-----------------------
; Java    |  2 + 3 + 4	 |   sb.append("Hello!")
; Clojure	|  (+ 2 3 4)	 |   (append sb "Hello!")
;
;
; Clojure has a simple and consistent syntax
; * like an AST written out (in list representation)
; * much more conchise as Common Lisp and Scheme
;

;;;
;;; Clojure syntax
;;; ==============
;
; Nil
; ---
;

nil

; not set, unspecified
; same as null in Java

;
; Boolean Literals
; ----------------
;

true
false

; false and nil evaluate to false in a boolean context
; 0, "" or () all evaluate to true in a boolean context (truthiness)

;
; Number Literals
; ---------------
;
; Long
;

1

(+ 2 3)
(* 2 (+ 3 4))

; prefix instead of infix
; operators are functions

; one simple simple syntax for everything
; function name in the first position, rest are arguments

;
; BigInteger
;
1N
123456789012345678901234567890N

(+ 2N 3N)
(* 2N (+ 3N 4N))

(* 123456789012345678901234567890N 123456789012345678901234567890N)

;
; Double
;
1.0

(+ 1.0 2.0)
(* 2.0 (+ 3.0 4.0))

;
; BigDecimal (arbitrary precision)
;
1.0M

1234567890.1234567890123456789M

(* 1234567890.1234567890123456789M 1234567890.1234567890123456789M)

;
; Rationals
;
2/3
(/ 2 3)

; result is a rational, no loss in precision

(/ (/ 2 3) 2)
(/ (/ 2 3) 2.0)

; result is a double, loss in precision

;;;
;;; Strings and Chars
;;; -----------------
;
; Strings
;
"Hello World!"

;
; Multiline Strings
;
"Hello
 World"

;
; Characters
;
\A
\B
\.

(seq "Hello!")

; gets the sequence of chars of the string

;;;
;;; Keywords and Symbols
;;; --------------------
;
; Symbols
;
;x
;(def x 1)
;x

; symbols are used to name values (alias)
; symbols evaluate to their value 

;
; Keywords
;
:keyword

; keywords evaluate to themselves

:clojure-presentation/keyword
::keyword

; keywords can be qualified by namespace
; keywords are useful as map keys and as labels (e.g. in enumerations)

;;;
;;; Namespaces
;;; ----------
; 
; * nonconflicting names
; * modularisation

; ns
; require

; (ns clojure-presentation.util)

(require '[clojure.string :as str])

(str/join " & " [1 2 3 4])

;;;
;;; Regular Expressions
;;; 
;
; RegEx Literal
;
#"^A.*B$"

; matches strings starting with \A and ending with \B

(re-matches #"^A.*B$" "ABCDEB")
(re-matches #"^A.*B$" "ABCDEF")

;;;
;;;  Collection Literals
;;;
;
; List
; (1 2 3 4)

; 1 is no function

;
; Quoted List
;

'(1 2 3 4)
'("Foo" "Bar")
'(:foo :bar)

;
; Vectors 
;

[1 2 3 4]
["Foo" "Bar"]
[:foo :bar]

; indexed collection

(nth [1 2 3 4] 1)
;(nth [1 2 3 4] 4)

; access by index

([1 2 3 4] 1)
(["Foo" "Bar"] 0)

; vectors are functions of their indices

;
; Set - unsorted collection, no duplicates
;

#{1 2 3 4}

; #{1 2 2 3 3 3 4 4 4 4}

(contains? #{1 2 3 4} 2)
(contains? #{1 2 3 4} 5)

;
; Sorted sets
;

(sorted-set 4 3 2 1)

;
; Map
;

{:a 1 :b 2 :c 3 :d 4}

; accessors
(get {:a 1 :b 2 :c 3 :d 4} :a)

(:a {:a 1 :b 2 :c 3 :d 4})
({:a 1 :b 2 :c 3 :d 4} :a)

; maps and keywords act as functions too

;
; Sorted Maps
;

(sorted-map :c 3 :d 4 :b 2 :a 1)

; sorted by key

;
; Commas
;

(= [1, 2, 3, 4] [1 2 3 4])

; commas are whitespace, use for usability

;;;
;;; Literal definition of data
;;;

{:firstname "Charlie"
 :lastname "Brown"
 :age 10
 :friends #{"Linus"}}

; vectors, maps and sets used as literals to define data
; no classes, constructors, setters needed

;;;
;;; Persistent Collections
;;; ======================
;
; * Immutable data
; * Structural sharing
; * Performant implementation (e.g. Bagwell-Trees)
; * Implication: data has to be build bottom up instead of top down



;;;
;;; Sequence Abstraction (ISeq)
;;; ---------------------------
;
; It is better to have 100 functions operate on one data structure
;   than 10 functions on 10 data structures.
;                                                    (Alan Perlis)
;

; convert a value to a sequence
(seq [1 2 3 4])
(seq [])
(sequence [])

; functions from ISeq
(first [1 2 3 4])
(rest [1 2 3 4])
(cons 0 [1 2 3 4])

; hundreds of functions for working with sequences
(count [1 2 3 4])
(reverse [1 2 3 4])
(partition 2 [1 2 3 4])
(sort [2 4 3 1])

(frequencies [1 1 2 3 4 3 2 1 1])

; https://clojure.org/api/cheatsheet

; ...
;;;; TODO


;;;
;;; Lazy Sequences
;;; --------------
;
; Convert to lazy sequence
(lazy-seq [1 2 3 4])

; Possibly infinitive sequences

(def natural-numbers (iterate inc 0))

; natural numbers (unbounded)

(take 100 natural-numbers)
(take 10 (drop 500 natural-numbers))

; only the needed values are calculated

;(println (take 10000 natural-numbers))

; Realize all values
(doall (lazy-seq [1 2 3 4]))


;;;
;;; Closures and Lexical Scoping
;;; ----------------------------

;
; local binding
;

(let [a 2
      b 3]
  (* a b))

; a and b are available in the context of let

; a

;;;
;;; Destructuring
;;; -------------

(let [[a b c d] [1 2 3 4]]
  (str a "," b "," c "," d))

(let [{a :a b :b c :c d :d} {:a 1 :b 2 :c 3 :d 4}]
  (str a "," b "," c "," d))

;;;
;;; Functions
;;; ---------
;
; define a symbol for the function
;

(fn [x] (* x x))

; anonymous function, lambda

(def square (fn [x] (* x x)))

; names the function by assigning to a symbol

(defn square
  "Returns the square of x." ; Docstring
  [x]
  (* x x))

; ideomatic function definition with the 'defn' macro

(square (+ 4 7))

; functions are executed at runtime
; when calling a fn the arguments get evaluated before the body is executed

;;;
;;; Pure Functions
;;; --------------
;
; * referential transparency
;   * result only depends on the input arguments
;   * no side effects (e.g. IO, randomness)
;   * function call can be replaced with the result
;
; * pure functions enable
; * simpler reasoning
; * caching of the return value for the given parameters (memoization)
;

(defn fib
  "Calculates the fibonacci number for 'n'.
   Uses recursion, so this implementation might blow the stack for n > 70."
  [n]
  (cond
    (= 0 n) 0
    (= 1 n) 1
    :else
    (+ (fib (- n 2)) (fib (- n 1)))))

(fib 2)
(fib 10)
;(fib 25)

(time (fib 2))
(time (fib 10))
;(time (fib 33))

;(def fib (memoize fib))

;(time (fib 33))
;(time (fib 80))

; meoize caches the calls to fib per input parameter
; nevertheless implementing fib recursively is not a good idea
; it will blow the stack quite soon


;;;
;;; Higher Order Functions
;;; ----------------------
;
; * higher order functions can
;   * take functions as parameters
;   * return functions as result
;
; * examples
;   * map
;     * applies a function to every element of a collection
;   * filter
;     * filters a collection with a predicate function
;   * reduce
;     * aggregates a collection by applying a reducing function
;       to the elements of the list
;

(map (fn [x] (* 2 x)) [1 2 3 4])
(map #(* 2 %) [1 2 3 4])

(filter even? [1 2 3 4])

(reduce + 0 [1 2 3 4])

;;;
;;; Special Forms
;;; -------------
; 
; * special forms have their own evaluation rules
; 
; * (def symbol init?)
; * (if test then else?)
; * (do exprs*)
; * (let [bindings* ] exprs*)
; * (quote form)
; * (var symbol)
; * (fn name? [params* ] condition-map? exprs*)
; * (fn name? ([params* ] condition-map? exprs*)+)
; * (loop [bindings* ] exprs*)
; * (recur exprs*)
; * (throw expr)
; * (try expr* catch-clause* finally-clause?)
; * (monitor-enter x)
; * (monitor-exit x)
;

;;;
;;; Macros
;;; ------
;
; * Clojure is homoiconic, code is data
;   * clojure code can transform clojure data
;   * clojure code *is* clojure data
;       => clojure code can transform clojure code
;   * with macros at compile time
;

(defmacro do-if [pred & body]
  (list 'if pred (cons 'do body)))

; compile time templating
; quote with '`', unquote with '~'

(/ 1 2)
(/ 1 0)

(defn reciproc [x]
  (do-if (not= 0 x)
         (println "Dividing 1 by" x)
         (/ 1 x)))

(reciproc 2)
(reciproc 0)

(macroexpand-1 '(do-if (not= 0 x)
                  (/ 1 x)))

; one level expansion

(macroexpand '(do-if (not= 0 x)
                (/ 1 x)))

; complete expansion

;
;
(defmacro my-macro
  "Documentation"
  [param]
	; Body
  )

; macros are executed at compile time
; when a macro is called, the arguments are not evaluated before the body is executed
; use macros with care, they are like a double edged sword

;;;
;;; Java Interoperation
;;; -------------------

;
; Creating java objects
;
(new Object)
(Object.)

;
; Calling static methods
;
(Math/sin 3.14)

;
; Calling instance methods
;
(let [sb (StringBuffer.)] ; constructor call
  (.append sb "Hello World") ; call append() on sb
  (.toString sb)) ; calling toString() on sb

;
; Importing classes
;
(import '[java.util Date])
(Date.)

;;;
;;; Protocols and Types
;;; =======================

;;;; TODO


;;;
;;; Reference Types
;;; ===============
;
; Building meaningful systems with immutable values 
;
; * values are immutable information, facts
; * values and state are different things
;    => state is the succession of values over time
; * values and identity are different things
;    => identity is the naming/aliasing of values

; Person 'Ludger'
(def ludger1 {:firstname "Ludger"
              :lastname "Solbach"
              :age 54})

; Ludger ages, birthday!
(update ludger1 :age inc)

ludger1

; ludger1 has not changed

; (def ludger2 (update ludger1 :age inc))
; ludger1
; ludger2

; how do I maintain the identity of 'Ludger' in the face of immutable data?
; Explicit state management via reference types.

;;;
;;; Overview
;;; --------

; Properties table
; 		          Atom  Ref   Agent	Var
; Coordinated	         X				
; Asynchronous	    	        X
; Retriable	     X	   X
; Thread-local 			               X

;
; Atoms
;

(def ludger3 (atom {:firstname "Ludger"
                    :lastname "Solbach"
                    :age 54}))
ludger3
(deref ludger3)
@ludger3
(swap! ludger3 update-in [:age] inc)
@ludger3

; (add-watch ludger3 :changed (fn [_ _ old new] (println "Change:" old new)))

;
; Refs
;

; first ref
(def ludger4 (ref {:id (java.util.UUID/randomUUID)
                   :firstname "Ludger"
                   :lastname  "Solbach"
                   :age 54}))

(deref ludger4)
@ludger4

; Software Transactional Memory (STM)
; ACID? ACI!

; (dosync)

; Watches
; (add-watch)

;
; Agents
;

;
; Vars
; 
(def ^:dynamic my-var)

(binding [my-var 1]
  (* my-var 2))

; vars are not variables
; thread locals, dynamic scope

;;;
;;; Concurrency
;;; ===========

;
; Delay
;

;
; Future
;

;
; Promise
;

;;;
;;; core.async
;;; ----------
;
; * implementation of Communicating Sequential Processes (CSP) from C.A.R. Hoare
; * channels and go blocks
;


;;;
;;; Examples
;;; ========
;
; * Swing App with Clojure
; * Internal DSLs with macros, programming XML in Clojure 
;

;;;; TODO


;;;
;;; References
;;; ==========
;
; http://clojure.org/
; http://clojurescript.org/

; http://github.org/lsolbach


;;;
;;; Literature
;;; ==========
;;;
;;; Clojure(Script) Specific
;;; ------------------------
;
; * Programming Clojure (3nd Edition)
; * Getting Clojure
; * Clojure Programming
; * The Joy of Clojure
; * Web Development with Clojure (3rd Edition)
; * Clojure Cookbook
; * Clojure for Machine Learning
; * Clojure for Data Science
; * Hands On Reactive Programming Clojure (2nd Edition)
; * Mastering Clojure Macros
; * Clojure High Performance Programming (2n Edition)
; * Elements of Clojure
;

;;;
;;; Functional Programming 
;;; ======================
;
; * Structure and Interpretation of Computer Programs
; * Land of Lisp
; * Grokking Simplicity
; * Let over Lambda
; * Purely Fuctional Data Structures
; * 7 Concurrency Models in 7 Weeks
;
;
; If you have a procedure with ten parameters,
;   you probably missed some.
;                                (Alan Perlis)
;
; http://www.cs.yale.edu/homes/perlis-alan/quotes.html

