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
; * uses functions as primary programming construct
; * functions are first class citizens
;   * functions as parameters
;   * functions as return values
;   * named and anonymous functions
;
; * Examples of functional programming languages
;   * Lisps: Common Lisp, Scheme, Clojure/ClojureScript
;

;;;
;;; Properties of Clojure
;;; =====================
;
; Clojure is
; * a functional programming language
; * a Lisp (but with less parenthesis)
; * simple
; * fun to use

; * Clojure runs on the JVM
; * ClojureScript runs in the Browser or on node.js
; * ClojureCLR runs on MS Common Language Runtime

;;;
;;; Features
;;; ========
;
; * functional
; * values, immutable data
; * explicit state
; * hosted
;   * runs on JVM, JavaScript, CLR
;   * complete access to the ecosystem of the platform
; * runs in shell (babashka)
;

;;;; TODO

;;;
;;; Java vs. Clojure Syntax
;;; =======================
;
; Java:    calculate(a, b)
; Clojure: (calculate a b)
; 
; * list evaluation
; * first entry is the function position
; * function is called with the rest of the list as parameters
;
;         |  Operators	 |   Methods/Functions
; --------+--------------+-----------------------
; Java    |  2 + 3 + 4	 |   sb.append("Hello!")
; Clojure	|  (+ 2 3 4)	 |   (append sb "Hello!")
;
;
; Clojure has almost no syntax
; * like an AST written out (in list representation)

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
;;; Clojure CLI
;;; ===========
;
; clj
; clojure
;
; * works perfect on Linux and Macs, not so on Windows

;;;
;;; Clojure Build Tools
;;; ===================
;
; * cjl/clojure
; * Leiningen
; * Maven, Gradle, Boot, ...
;

;;;
;;; The REPL
;;; ========
;
; * Read
; * Evaluate
; * Print
; * Loop
;
; * Interactive develpment
; * Instant feedback
; => Clojure's superpower!
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

; operators are functions too
; prefix instead of infix

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

; for naming/alializing values
; symbols evaluate to their value 

;
; Keywords
;
:keyword

; keywords evaluate to themselves

::keyword

; keywords can be qualified by namespace

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

;
; Vectors 
;

[1 2 3 4]

; indexed collection

(nth [1 2 3 4] 1)
;(nth [1 2 3 4] 4)

; access by index

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

; maps and keywords act as functions

;
; Sorted Maps
;
(sorted-map :c 3 :d 4 :b 2 :a 1)

;
; Commas
;
(= [1, 2, 3, 4] [1 2 3 4])

; commas are whitespace, use for usability

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
;;; Persistent Collections
;;; ======================
;
; * Immutable data
; * Structural sharing
; * Performant implementation (Bagwell-Trees)
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
; * no side effects (e.g. IO, randomness)
;
; * simpler reasoning
; * enables caching of the value for the parameters (memoization)
;

(square (+ 4 7))
(square (+ 4 7))
(time (square (+ 4 7)))

(def square (memoize square))

(time (square (+ 4 7)))

;;;
;;; Higher Order Functions
;;; ----------------------
;
; * map
; * filter
; * reduce
;

(map (fn [x] (* 2 x)) [1 2 3 4])
(map #(* 2 %) [1 2 3 4])

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

(defmacro do-if [pred body]
  `(if ~pred (do ~body)))

; quote with '`', unquote with '~'

(defn reciproc [x]
  (do-if (not= 0 x)
       (/ 1 x)))

(reciproc 1)
(reciproc 0)

(macroexpand-1 '(do-if (not= 0 x)
                  (/ 1 x)))

; one level expansion

(macroexpand '(do-if (not= 0 x)
                (/ 1 x)))

; complete expansion

;
; Compile time templating
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

