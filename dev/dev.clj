(ns dev
  (:require [clojure.repl :as repl]
            [clojure.java.javadoc :as javadoc]
            [clojure.string :as str]))

;;;
;;; Portal data viewer
;;;
(comment
  (require '[portal.api :as portal])
  (def p (portal/open {:launcher :vs-code}))
  ;(def p (portal/open))
  (add-tap #'portal/submit)

  (tap> "hello")
  (portal/clear)
  (tap> :world)
  (tap> {:firstname "Donald"
         :lastname "Duck"
         :address {:street "Entenstr. 123"
                   :city "Entenhausen"}})

  (remove-tap #'portal/submit)

  (portal/close)
  (portal/docs))

;;;
;;; Criterium
;;; 
(comment
  (require '[criterium.core :as criterium])
  (criterium/bench (Thread/sleep 1000))
  (criterium/quick-bench (Thread/sleep 1000))
  )

;;;
;;; Expound spec tool
;;;
(comment
  (require '[expound.alpha :as expound])
  
  )

;;;
;;; Clj->Java decompiler
;;;
(comment
  (require '[clj-java-decompiler.core :refer [decompile disassemble]])
  (decompile (fn [] (println "Hello, World!")))
  (disassemble (fn [] (println "Hello, World!")))
  ;
  )

;;;
;;; REPL
;;;
(comment 
  (repl/doc clojure.core/defn)
  (repl/source clojure.core/defn)
  ;
  )

;;;
;;; Javadoc
;;;
(comment
  (javadoc/javadoc
   (java.util.Date.))
  ;
  )

;;;
;;; Namespace exploration
;;;
(comment
  ; All namespaces in the project
  (all-ns)
  (first (all-ns))

  ; The symbol of the namespace
  (ns-name 'clojure.string)

  ; Aliases of the required namespaces
  (ns-aliases 'clojure.string)

  ; Public vars in the namespace
  (ns-publics 'clojure.string)

  ; Referred vars in the namespace
  (ns-refers 'clojure.string)
  
  ; Vars in the namespace (including private vars)
  (ns-interns 'clojure.string)

  ; Imported Java classes in the namespace
  (ns-imports 'clojure.string)

  ; All the vars in the namespace
  (ns-map 'clojure.string)

  (repl/dir clojure.string)

  ; List all methods for a multimethod
  (methods clojure.string/split)

  ;
  )
