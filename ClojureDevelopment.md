Clojure/ClojureScript Development
=================================
This is a compilation of resources about software development in Clojure. I maintain this page as a personal reference of interesting Clojure related information but also to provide this information to other (beginning) Clojurists.


Language
--------
### Clojure
* [Clojure](https://clojure.org) - Clojure is a functional programming language hosted on the JVM

### ClojureScript
* [ClojureScript](https://clojurescript.org/index) - ClojureScript is a compiler for Clojure that targets JavaScript


Build Tools/Runners
-------------------
* [Getting started](https://clojure.org/guides/getting_started) - Installing clj/clojure
* [Leiningen](https://leiningen.org/)
* [Boot](https://github.com/boot-clj/boot)
* [Baumeister](https://github.com/lsolbach/)
* [Maven](https://maven.apache.org/)
* [shadowcljs](http://shadow-cljs.org/)


Editors/IDEs
------------
* [Visual Studio Code](https://code.visualstudio.com/) + [Calva](https://github.com/BetterThanTomorrow/calva)
* Emacs + [Cider](https://github.com/clojure-emacs/cider), [Cider Docs](https://docs.cider.mx/cider/0.25/index.html)
* IntelliJ + [Cursive](https://cursive-ide.com/)
* Eclipse + [CounterClockWise](https://github.com/ccw-ide/ccw)
* [Atom](https://atom.io/) + ProtoREPL/ParInfer or Chlorine
* [NightCode](https://github.com/oakes/Nightcode)
* [NightLight](https://sekao.net/nightlight/) - An embedded editor for Clojure
* [LightTable](http://lighttable.com/)


REPLs/REPL Tools
----------------
* [nREPL](https://github.com/nrepl/nrepl) - Network REPL
* [gorilla-repl](http://gorilla-repl.org/) - Browser REPL with plotting support
* [protoREPL](https://github.com/jasongilman/proto-repl) - REPL for Atom
* [unrepl](https://github.com/Unrepl/unrepl)
* [unravel](https://github.com/Unrepl/unravel)
* [rebel-readline](https://github.com/bhauman/rebel-readline) - Multiline Editor for a terminal REPL
* [REBL](http://rebl.cognitect.com/) - A graphical, interactive tool for browsing Clojure data
* [integrant-repl](https://github.com/weavejester/integrant-repl)
* [Figwheel Main](https://figwheel.org/) - Figwheel Main builds your ClojureScript code and hot loads it as you are coding
* [figwheel.main template](https://rigsomelight.com/figwheel-main-template/) - Template generator that will produce a minimal ClojureScript project that includes figwheel.main tooling
* [planck2](https://github.com/planck-repl/planck) - ClojureScript REPL for the desktop
* [Lumo](https://github.com/anmonteiro/lumo) - Lumo is a standalone ClojureScript environment that runs on Node.js and the V8 JavaScript engine
* [tubular](https://github.com/mfikes/tubular) - A Clojure Socket REPL client


Libraries
---------
### Overview
* [The Clojure Toolbox](https://www.clojure-toolbox.com/) - Curated list of Clojure libraries

### System Configuration
* [Component](https://github.com/stuartsierra/component)
* [Integrant](https://github.com/weavejester/integrant)
* [Mount](https://github.com/tolitius/mount)

### Classpath
* [dynapath](https://github.com/tobias/dynapath)

### I/O
#### Network Sockets
* [clj-sockets](https://github.com/atroche/clj-sockets)
* [async-sockets](https://github.com/bguthrie/async-sockets)
* [aleph](https://github.com/ztellman/aleph) - Fast asynchronous HTTP server based on Netty
* [link](https://github.com/clojure-link/link)

#### Serial Communication
* [clj-serial](https://github.com/peterschwarz/clj-serial) - Serial connections with CLojure

#### MicroControllers (e.g. Arduino/ESP32)
* [clj-firmata](https://github.com/peterschwarz/clj-firmata) -
* cloduino

### Web
#### Libraries
* [ring](https://github.com/ring-clojure/ring) - Clojure HTTP server abstraction
* [compojure](https://github.com/weavejester/compojure) - Ring routing library
* [yada](https://github.com/juxt/yada), [yada docs](https://www.juxt.land/yada/manual/index.html) - Framework for production ready web services
* [sente](https://github.com/ptaoussanis/sente) - Client/Server communication with core.async over WebSockets or AJAX

#### Web Services
* [liberator](https://github.com/clojure-liberator/liberator/) - Framework for web services

#### Static Site Generation
* [cryogen](https://github.com/cryogen-project/cryogen) - Leiningen template for static site generation

### Cloud
#### AWS
* [amazonica](https://github.com/mcohen01/amazonica) - Clojure wrapper for the AWS SDK

### UI
#### JVM
##### Swing
* [seesaw](https://github.com/daveray/seesaw)
* [clj-swing](https://github.com/lsolbach/CljBase) - Clojure API for Java Swing

##### JavaFX
* [fn-fx](https://github.com/fn-fx/fn-fx) - a functional, declarative wrapper around JavaFX / OpenJFX
* [cljfx](https://github.com/cljfx/cljfx) - a declarative, functional and extensible wrapper of JavaFX inspired by better parts of react and re-frame
* [cljfx/css](https://github.com/cljfx/css) - Charmingly Simple Styling for cljfx

#### ClojureScript
* [reagent](http://reagent-project.github.io/)
* [re-frame](https://github.com/Day8/re-frame)

#### ClojureScript React Native
* [ClojureScript + React Native](https://cljsrn.org/)
* [re-natal](https://github.com/drapanjanas/re-natal)
* [expo-cljs-template](https://github.com/seantempesta/expo-cljs-template)

### Math
* [incanter](https://github.com/incanter/incanter) - Incanter is a Clojure-based, R-like statistical computing and graphics environment
* [clojure.math.combinatorics](https://github.com/clojure/math.combinatorics)
* [clj-math](https://github.com/lsolbach/CljMath) - Clojure Math library

### Visualization
* [oz](https://github.com/metasoarous/oz) - data visualization and scientific document processing library for Clojure built around Vega-Lite & Vega
* [cmp.jfreechart](https://github.com/lsolbach/CljComponents) - Clojure wrapper and API for JFreeChart

### Functional Progamming
* [xforms](https://github.com/cgrand/xforms) - additional transducers

### Utility
* [clojure.tools.namespace](https://github.com/clojure/tools.namespace)
* [Editscript](https://github.com/juji-io/editscript) - find and edit differences in data
* [expound](https://github.com/bhb/expound) - human readable spec error reporting
* [instaparse](https://github.com/Engelberg/instaparse) - Parser generator for context-free grammars

### Testing
* [clojure.test](https://clojure.github.io/clojure/clojure.test-api.html) - standard unit testing
* [test.check](https://github.com/clojure/test.check) - property based testing
* [Criterium](https://github.com/hugoduncan/criterium) - Benchmark testing library


Applications
------------
* [Metabase](https://github.com/metabase/metabase) -

Community
---------
* [Clojurians Slack](http://clojurians.net/) - request invitation before joining
* [#clojure on Freenode.net IRC](https://webchat.freenode.net/) - good old Internet Relay Chat
* [Clojurists Together Foundation](https://www.clojuriststogether.org) - Clojure open source project sponsorship

Tutorials
---------
### Clojure
#### Interactive
* [Maria](https://www.maria.cloud/) - a web coding environment for beginners
* [4clojure](http://www.4clojure.com/)

#### Texts
* [A Joyful Introduction to Clojure, Part I](https://medium.com/@daniel.oliver.king/a-clojure-development-environment-that-gets-out-of-your-way-c11e6711ead3)
* [A Joyful Introduction to Clojure, Part II](https://medium.com/@daniel.oliver.king/getting-work-done-in-clojure-the-building-blocks-39ad82796926)
* [A Joyful Introduction To Clojure: Part III](https://medium.com/@daniel.oliver.king/getting-real-work-done-in-clojure-application-development-683c8129a313)
* [Clojure Concurrency Tutorial](https://purelyfunctional.tv/guide/clojure-concurrency/)

#### deps.edn
* [dot-clojure](https://github.com/seancorfield/dot-clojure)

#### REPL Workflow Reloaded
* [Reloaded Workflow](http://thinkrelevance.com/blog/2013/06/04/clojure-workflow-reloaded)
* Leiningen dev profile with user.clj on extra source path
* add dev namespaces to user.clj
  * [tools.namespace](https://github.com/clojure/tools.namespace)
  * [java.classpath](https://github.com/clojure/java.classpath)
* add 'system' state with start/stop methods

### ClojureScript
* [modern-cljs](https://github.com/magomimmo/modern-cljs)

### Datomic
* [Learn Datalog Today](http://www.learndatalogtoday.org/)

Videos
------
### Functional Programming
* [Robert C Martin - Functional Programming; What? Why? When?](https://www.youtube.com/watch?v=7Zlp9rKHGD4)

### Clojure
* [ClojureTV](https://www.youtube.com/channel/UCaLlzGqiPE2QRj6sSOawJRg) - youtube channel

#### Clojure Basics
* [Clojure for Java Programmers Part 1 - Rich Hickey](https://www.youtube.com/watch?v=P76Vbsk_3J0)
* [Clojure for Java Programmers Part 2 - Rich Hickey](https://www.youtube.com/watch?v=hb3rurFxrZ8)
* [Clojure Data Structures Part 1 - Rich Hickey](https://www.youtube.com/watch?v=ketJlzX-254)
* [Clojure Data Structures Part 2 - Rich Hickey](https://www.youtube.com/watch?v=sp2Zv7KFQQ0)
* [Clojure Concurrency - Rich Hickey](https://www.youtube.com/watch?v=nDAfZK8m5_8)
* [Clojure Made Simple - Rich Hickey](https://www.youtube.com/watch?v=VSdnJDO-xdg)
* [Effective Programs - 10 Years of Clojure - Rich Hickey](https://www.youtube.com/watch?v=2V1FtfBDsLU)
* [Transducers - Rich Hickey](https://www.youtube.com/watch?v=Tq7r97G4b7Y)
* [Inside Transducers - Rich Hickey](https://www.youtube.com/watch?v=4KqUvG8HPYo)
* [Clojure core async - Rich Hickey](https://www.youtube.com/watch?v=drmNlZVkUeE)
* [Spec-ulation Keynote - Rich Hickey](https://www.youtube.com/watch?v=oyLBGkS5ICk) - about changing and breaking software and how versioning artifacts doesn't help
* [Maybe Not - Rich Hickey](https://www.youtube.com/watch?v=YR5WdGrpoug)
* [REBL - Stuart Halloway](https://www.youtube.com/watch?v=c52QhiXsmyI)
* [Always Be Composing - Zach Tellman](https://www.youtube.com/watch?v=3oQTSP4FngY)
* [Everything Will Flow - Zach Tellman](https://www.youtube.com/watch?v=1bNOO3xxMc0)

#### Workflow
* [Clojure Basics: Editor and Tooling Setup](https://www.youtube.com/watch?v=kjJVfoqFj_k)
* [1. Atom, Chlorine, and Cognitect's REBL - Sean Corfield](https://www.youtube.com/watch?v=ZhzMoEz4j1k)
* [2. Clojure CLI/deps.edn - Sean Corfield](https://www.youtube.com/watch?v=CWjUccpFvrg)
* [3. Fixing a bug in core.memoize - Sean Corfield](https://www.youtube.com/watch?v=UFY2rd05W2g)
* [Proto REPL, a New Clojure Development and Visualization Tool - Jason Gilman](https://www.youtube.com/watch?v=buPPGxOnBnk&feature=youtu.be)
* [Cursive: A different type of IDE - Colin Fleming](https://www.youtube.com/watch?v=vt1y2FbWQMg)
* [Hammock Driven Development - Rich Hickey](https://www.youtube.com/watch?v=f84n5oFoZBc)

### Experience
* [Why Clojure? - Derek Slager](https://www.youtube.com/watch?v=BThkk5zv0DE)

### ClojureScript
* [ClojureScript for Skeptics - Derek Slager](https://www.youtube.com/watch?v=gsffg5xxFQI)

### App Development
* [ClojureScript loves React Native - Peter Strömberg](https://www.youtube.com/watch?v=QsUj7HO5xDg) - tutorial for developing react native apps in clojure
* [cljfx – Bringing Clojure to the Desktop - Vlad Protsenko](https://www.youtube.com/watch?v=xcMNTKFmEgI) - build javaFX desktop apps with clojure

Books
-----
* [Clojure Cookbook]()
  * [Clojure Cookbook Resources](https://github.com/clojure-cookbook/clojure-cookbook)

Blog Posts
----------
### Clojure
* [Reducers, transducers and core.async in Clojure](https://eli.thegreenplace.net/2017/reducers-transducers-and-coreasync-in-clojure/)
* [Clojure concurrency and blocking with core.async](https://eli.thegreenplace.net/2017/clojure-concurrency-and-blocking-with-coreasync/)

### ClojureScript
* [ClojureScript Macros](https://code.thheller.com/blog/shadow-cljs/2019/10/12/clojurescript-macros.html)
