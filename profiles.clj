{:user
 {:dependencies [[djblue/portal "0.55.1"]
                 [criterium/criterium "0.4.6"]
                 [com.clojure-goes-fast/clj-java-decompiler "0.3.4"]
                      ; [expound/expound "0.9.0"]
                 ]
  :global-vars {*warn-on-reflection* true}}
 :flowstorm
 {:dependencies [[com.github.flow-storm/clojure "1.12.0-alpha9_1"]
                 [com.github.flow-storm/flow-storm-dbg "3.13.1"]]
  :exclusions [org.clojure/clojure]
  :jvm-opts ["-Dflowstorm.startRecording=false"
             "-Dclojure.storm.instrumentEnable=true"
             "-Dclojure.storm.instrumentAutoPrefixes=true"
             ;; with whatever editor you have
             "-Dflowstorm.jarEditorCommand=emacsclient -n +<<LINE>>:0 <<JAR>>/<<FILE>>"
             "-Dflowstorm.fileEditorCommand=emacsclient -n +<<LINE>>:0 <<FILE>>"]}}
