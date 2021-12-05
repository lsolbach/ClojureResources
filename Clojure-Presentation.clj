;;;; Clojure/ClojureScript
;;;; =====================
;
; 19. A language that doesn't affect the way you think about programming, is not worth knowing. (Alan Perlis)
;

; Functional Programming
; ----------------------
;
; * programming paradigm
; * uses functions as primary programming construct (functions as first class citizens)
;
; * Exmples of functional programming languages
;   * Lisps: Common Lisp, Scheme, Clojure/ClojureScript

; Benefits of Pure Functions
; --------------------------

; * referential transparency
; * no side effects
; * simpler reasoning
; * enables memoization


; Higher Order Functions
; ----------------------
;
; * map
; * reduce
; * filter


; Basics
; ------

; Clojure is
; * a functional programming language
; * a Lisp (but with less parenthesis)
; * simple
; * fun to use

; * almost no syntax
; * like an AST written out (in list representation)
; * homoiconic, code is data is code...
;   * clojure code can transform clojure data
;   * clojure code *is* clojure data, clojure code can transform clojure code
;   * with macros at compile time

;
; * Clojure runs on the JVM
; * ClojureScript runs in the Browser or on node.js



; Features
; --------
;
; Java/Clojure
; ------------
; 
; 		Operators	Methods/Fuctions
; Java		2 + 3 + 4	sb.append("Hello!")
; Clojure	(+ 2 3 4)	(append sb "Hello!")
; 
;
; Functions
;---------
;
; Java:    calculate(a, b)
; Clojure: (calculate a b)
; 
; * list evaluation
; * first entry is the function position
; * function is called with the rest of the list as parameters

; Development Environments
; ------------------------
; 
; * VS Code with Calva
; * Emacs with Cider
; * IntelliJ with Cursive
; * Eclipse with Counterclockwise
; * ...
;

; Clojure REPL
; ------------
;
; * Read Evaluate Print Loop
; * Interactive develpment
; * Instant feedback
; java -cp clojure-1.10.3.jar clojure.main

; Clojure CLI
; clj
; clojure

; <DEMO>


; Clojure syntax
; --------------

; Scalars
; -------

; Nil and Boolean
; ---------------
; Nil / Null Value

nil

; Boolean Literals:
true
false

; false and nil evaluate to false in a boolean context
; 0, "" or () all evaluate to true in a boolean context (truthiness)

; Numbers
; -------

; Number Literals:
; Long
1

; BigInteger
1M
123456789012345678901234567890M

; Double
1.0

; BigDecimal (arbitrary precision)
1.0N

; Rationals
2/3

; Strings and Chars
; -----------------

; String:
"Hello World!"

; Multiline:
"Hello
 World"

; Character A:
\A

; Namespaces
; ----------
; 
; Modularisation

ns
require


; Keywords and Symbols
; --------------------
;
; Symbol:
x
(def x 1)
x

; Symbols evaluate to their value 

; Keyword:
:keyword

; Keywords evaluate to themselves

; Regular Expressions
; -------------------
; 
; RegEx:
#"^A.*B$"

; Matching example: 
; TODO

; Persistent Collections
; ----------------------
;
; * Immutable data
; * Structural sharing
; * Performant implementation (B-Trees)
; * Implication: data has to be build bottom up instead of top down


; Collection Literals
; -------------------
;
; Commas are whitespace:
(= [1, 2, 3] [1 2 3]) 

; List:
(1 2 3)

; Quoted List:
'(1 2 3)

; Vector - sorted collection:
[1 2 3]

(nth [1 2 3] 1)
(nth [1 2 3] 4)

; Set - unsorted collection, no duplicates:
#{1 2 3}

#{1 2 2 3 3 3}

(contains? #{1 2 3} 2)
(contains? #{1 2 3} 5)

; sorted variant
(sorted-set 3 2 1)

; Map:
{:a 1 :b 2 :c 3}

; accessors
(:a {:a 1 :b 2 :c 3})
({:a 1 :b 2 :c 3} :a)

(sorted-map :c 3 :b 2 :a 1)

; Sequence Abstraction
; --------------------
; 9. It is better to have 100 functions operate on one data structure than 10 functions on 10 data structures. (Alan Perlis)

(seq coll)

(first coll)

(rest coll)

(cons i coll)

; Hundreds of functions for working with sequences
(count [1 2 3])
(reverse [1 2 3])


; Lazy Sequences
; --------------
;
; Convert to lazy sequence
(lazy-seq coll)

; Realize all values
(doall s)

; Possibly infinitive sequences
 ; natural numbers
(def natural-numbers (iterate inc 0))

; Only needed values are calculated
(take 10 (drop 50 natural-numbers))


; Closures and Lexical Scoping
; ----------------------------
;
(let [a 1
      b 2]
  (* a b))
a

; Destructuring
; -------------

(let [[a b c] [1 2 3]
  (println a b c))

(let [{a :a b :b c :c} {:a 1 :b 2 :c 3}]
  (println a b c))


; Functions
; ---------
;

; define a symbol for the function
(def square (fn [x] (* x x)))

; Defn:
(defn square
  "Returns the square of x." ; Docstring
  [x]
  (* x x))

; functions are executed at runtime
; when calling a fn the arguments get evaluated before the body is executed

; Macros
; ------
;
; Compile time templating
(defmacro my-macro
	"Documentation"
	[param]
	; Body
	)

; macros are executed at compile time
; when a macro is called, the arguments are not evaluated before the body is executed
; use macros with care, they are like a double edged sword


; Special Forms
; -------------
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


; Java Interoperation
; -------------------

; Creating Java Objects
(new Object)
(Object.)

; Calling Static Methods
(Math/sin 3.14)

; Calling Instance Methods
(let [sb (StringBuffer.)] ; constructor call
  (.append sb "Hello World") ; call append() on sb
  (.toString sb)) ; calling toString() on sb


; Protocols and Datatypes
; -----------------------




; Reference Types
; ---------------

; Value and Identity

; Person 'Ludger'
{:firstname "Ludger"
 :lastname "Solbach"
 :age 53}

; Ludger ages... :-(
; How do I maintain the identity of 'Ludger' in the face of immutable data?


; Overview
; --------

; Properties table
; 		Ref	Agent	Atom	Var
; Coordinated	X				
; Asynchronous		X
; Retriable	X		X
; Thread-local 			X

; Vars
; ----
; 
; vars are not variables
; thread local, dynamic scope


; Atoms
; -----



; Refs
; ----


; Software Transactional Memory (STM)
; ACID? ACI!

; (dosync)

; Watches
; (add-watch)


;;; Agents
;;; ------



;;; Examples
;;; --------
;
; * Swing App with Clojure
; * Internal DSLs with macros, programming XML in Clojure 



; References
; ----------
;
; http://clojure.org/
; http://clojurescript.org/

; http://github.org/lsolbach


; Literature
; ----------

; Clojure(Script) Specific
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

; Functional Programming 
;
; * Structure and Interpretation of Computer Programs
; * Land of Lisp
; * Let over Lambda
; * Purely Fuctional Data Structures
; * 7 Concurrency Models in 7 Weeks


; 11. If you have a procedure with ten parameters, you probably missed some. (Alan Perlis)
; http://www.cs.yale.edu/homes/perlis-alan/quotes.html




