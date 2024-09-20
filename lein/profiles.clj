{:user
 {:dependencies [[djblue/portal "0.57.3"]
                 [criterium/criterium "0.4.6"]
                 [com.clojure-goes-fast/clj-java-decompiler "0.3.6"]
                      ; [expound/expound "0.9.0"]
                 ]
  :plugins [[com.github.liquidz/antq "RELEASE"]
            [lein-cloverage "1.2.4"]
            [lein-codox "0.10.8"]]
     ;; optional - you can add antq options here:
  :antq {}
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
