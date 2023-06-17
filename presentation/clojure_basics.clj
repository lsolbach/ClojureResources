(ns presentation.clojure-basics)

;;;;
;;;; Clojure/ClojureScript
;;;; =====================
;
; A language that doesn't affect the way you think
;   about programming, is not worth knowing.
;                                    (Alan Perlis)
;

;;;
;;; Why I love Clojure
;;; ==================
;
; * conceptionally simple yet powerful
;   * not complected
;   * simple to reason about
; * fun to use
;   * interactive development
;   * very productive
; * many use cases
;   * backend (Clojure, ClojureCLR)
;   * browser (ClojureScript)
;   * shell   (Babashka)
;

;;;
;;; The REPL
;;; ========
;
;  +-> Read -> Evaluate -> Print -+
;  |                              |
;  +-------------Loop-------------+
;
; * interactive develpment
; * instant feedback
; => Clojure's superpower!
;

;;;
;;; Example
;;; =======
;
; from the non-negative natural numbers, filter the odd numbers,
; square them and return the first 10 squares
(take 10 (map #(* % %) (filter odd? (range))))

; you've seen nearly everything about clojure now

;;;
;;; Clojure syntax
;;; ==============

;;
;; scalar literals
;;
;
; nil, java null, missing values
nil

; boolean 
true
false

; false and nil evaluate to false in a boolean context
; 0, "" or () all evaluate to true in a boolean context (truthiness)

; numbers
;
; longs
1
(+ 2 3)
(* 2 (+ 3 4))

; prefix instead of infix
; operators are functions
;
; one simple simple syntax for everything
; function name in the first position, rest are arguments

; big integers
1N
123456789012345678901234567890N
(* 123456789012345678901234567890N 123456789012345678901234567890N)

; doubles
1.0
(+ 1.0 2.0)
(* 2.0 (+ 3.0 4.0))

; big decimals
1.0M
1234567890.1234567890123456789M
(* 1234567890.1234567890123456789M 1234567890.1234567890123456789M)

; rationals
2/3
(/ 2 3)
(/ (/ 2 3) 2)
(/ (/ 2 3) 2.0)
; result is a double, loss in precision

; strings
"Hello World!"

"Hello
 World" ; multiline

; characters
\A
\B
\.

; sequence of characters
(seq "Hello!")


; symbols
;(def x 1)
;x

; symbols are used to name values (alias)
; symbols evaluate to their value 

; keywords
:keyword

; keywords evaluate to themselves

:clojure-basics/keyword
::keyword

; keywords can be qualified by namespace
; keywords are useful as map keys and as labels (e.g. in enumerations)

;;
;; collection literals
;;

; list
; (1 2 3 4)
; error, 1 is no function

'(1 2 3 4)
'("Foo" "Bar")

; vectors (indexed collection)
[1 2 3 4]
["Foo" "Bar"]

; access by index
(nth [1 2 3 4] 1)
;(nth [1 2 3 4] 4)

; vectors are functions of their indices
([1 2 3 4] 1)
(["Foo" "Bar"] 0)

; sets
#{1 2 3 4}
(sorted-set 4 3 2 1)

(contains? #{1 2 3 4} 2)
(contains? #{1 2 3 4} 5)

; maps
{:a 1 :b 2 :c 3 :d 4}
(sorted-map :c 3 :d 4 :b 2 :a 1)

(get {:a 1 :b 2 :c 3 :d 4} :a)
(:a {:a 1 :b 2 :c 3 :d 4})
({:a 1 :b 2 :c 3 :d 4} :a)
; maps and keywords act as functions too

;;
;; Literal definition of data
;;

{:firstname "Charlie"
 :lastname "Brown"
 :age 10
 :friends #{"Linus"}}

; vectors, maps and sets used as literals to define data
; no classes, constructors, setters needed


;;
;; Java Interoperation
;; 

; static method calls
(Math/sin 3.14)

; construction
(new Object)
(Object.)

; imports
(import '[java.util Date])
(Date.)

; instance methods
(let [sb (StringBuffer.)] ; constructor call
  (.append sb "Hello World") ; call append() on sb
  (.toString sb)) ; calling toString() on sb

