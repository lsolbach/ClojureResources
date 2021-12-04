Clojure/ClojureScript Development
=================================
This is a compilation of resources about software development in Clojure.
I maintain this page as a personal reference of interesting Clojure related information but also to provide this information to other (beginning) Clojurists.


Language
--------
### Clojure
* [Clojure](https://clojure.org) - Clojure is a functional programming language hosted on the JVM

### ClojureScript
* [ClojureScript](https://clojurescript.org/index) - ClojureScript is a compiler for Clojure that targets JavaScript

Documentation
-------------

* [Learn Clojure - Syntax](https://clojure.org/guides/learn/syntax) - Start of the official Clojure guides
* [Reference - The Reader](https://clojure.org/reference/reader) - Start of the official Clojure reference
* [Clojure Doc](https://clojure-doc.github.io/) - The community-driven documentation site for the Clojure programming language
* [cljdoc](https://cljdoc.org/) - A website building & hosting documentation for Clojure/Script libraries

* [Clojure Style Guide](https://guide.clojure.style/) - A comprehensive style guide for Clojure

Build Tools/Runners
-------------------
* [Getting started](https://clojure.org/guides/getting_started) - Installing clj/clojure CLIs 
* [Leiningen](https://leiningen.org/)
* [Boot](https://github.com/boot-clj/boot)
* [Maven](https://maven.apache.org/) - Java build system which can build clojure code, too 
* [shadowcljs](http://shadow-cljs.org/)
* [Baumeister](https://github.com/lsolbach/) - My own multi language build system, currently not maintained


Editors/IDEs
------------
* [Visual Studio Code](https://code.visualstudio.com/) + [Calva](https://github.com/BetterThanTomorrow/calva)
* Emacs + [Cider](https://github.com/clojure-emacs/cider), [Cider Docs](https://docs.cider.mx/cider/0.25/index.html)
* IntelliJ + [Cursive](https://cursive-ide.com/)
* [Eclipse](https://www.eclipse.org/) + [CounterClockWise](https://github.com/ccw-ide/ccw)
* [Atom](https://atom.io/) + ProtoREPL/ParInfer or Chlorine
* [NightCode](https://github.com/oakes/Nightcode)
* [NightLight](https://sekao.net/nightlight/) - An embedded editor for Clojure
* [LightTable](http://lighttable.com/)


REPLs/REPL Tools
----------------
* [nREPL](https://github.com/nrepl/nrepl) - Network REPL
* [gorilla-repl](http://gorilla-repl.org/) - Browser REPL with plotting support
* [protoREPL](https://github.com/jasongilman/proto-repl) - REPL for Atom
* [unrepl](https://github.com/Unrepl/unrepl) - 
* [unravel](https://github.com/Unrepl/unravel) - 
* [rebel-readline](https://github.com/bhauman/rebel-readline) - Multiline Editor for a terminal REPL
* [REBL](http://rebl.cognitect.com/) - A graphical, interactive tool for browsing Clojure data
* [integrant-repl](https://github.com/weavejester/integrant-repl)

* [Figwheel Main](https://figwheel.org/) - Figwheel Main builds your ClojureScript code and hot loads it as you are coding
* [figwheel.main template](https://rigsomelight.com/figwheel-main-template/) - Template generator that will produce a minimal ClojureScript project that includes figwheel.main tooling

* [Babashka](https://github.com/babashka/babashka) - Clojure shell programming/bash replacement
* [planck2](https://github.com/planck-repl/planck) - ClojureScript REPL for the desktop
* [Lumo](https://github.com/anmonteiro/lumo) - Lumo is a standalone ClojureScript environment that runs on Node.js and the V8 JavaScript engine

* [tubular](https://github.com/mfikes/tubular) - A Clojure Socket REPL client


Libraries
---------
### Overview
* [Clojars](https://clojars.org/) - An easy to use community repository for open source Clojure libraries
* [The Clojure Toolbox](https://www.clojure-toolbox.com/) - Curated list of Clojure libraries

### System Configuration
* [Component](https://github.com/stuartsierra/component)
* [Integrant](https://github.com/weavejester/integrant)
* [Mount](https://github.com/tolitius/mount)

### Functional Progamming
* [xforms](https://github.com/cgrand/xforms) - additional transducers

### Logic Programming
* [core.logic](https://github.com/clojure/core.logic) - Prolog-like relational logic programming based on miniKanren

### Asynchronous Programming
* [core.async](https://github.com/clojure/core.async) - Asynchronous programming/communication

### Specification/Validation
* [Spec](https://github.com/clojure/spec.alpha) - Spec is Clojure core library to describe the structure of data and functions.
* [Spec2](https://github.com/clojure/spec-alpha2) - Spec2 is an evolution from spec as well as work towards several new features.
* [Schema]() - 
* [Malli]() - 

### Data Formats
* [data.json](https://github.com/clojure/data.json) - Read/write JSON
* [data.csv](https://github.com/clojure/data.csv) - Read/write CSV
* [data.xml](https://github.com/clojure/data.xml) - Read/write XML
* [YAML](https://github.com/owainlewis/yaml) - Read/wite YAML
* [Clojure ProtoBuf](https://github.com/flatland/clojure-protobuf) - Specify/read/write ProtoBuf
* [Lancaster](https://github.com/deercreeklabs/lancaster) - Specify/read/write AVRO
* [abracad](https://github.com/damballa/abracad) - Specify/read/write AVRO
* [dove](https://github.com/piotr-yuxuan/dove) - Infer specs from AVRO schemas to use in validation and generative testing
* [BinF](https://github.com/helins/binf.cljc) - Specify/read/write general binary formats

### Data Access
* [data.zip](https://github.com/clojure/data.zip) - Zipper library to access data in nested data structures
* [core.cache](https://github.com/clojure/core.cache) - Caching data with strategies like FIFO, LU/LRU or TTL
* [jackdaw](https://github.com/FundingCircle/jackdaw) - Kafka library for clojure
* [next-jdbc](https://github.com/seancorfield/next-jdbc) - Database access via JDBC

### Database
* [Datomic](https://www.datomic.com/) - Datalog based db from Cognitect with features like immutability and temporal queries
* [Datascript](https://github.com/tonsky/datascript) - Datalog based in-memory db
* [Datalevin](https://github.com/juji-io/datalevin) - Datalog based engine with fast LMDB persistent storage
* [Datahike](https://github.com/replikativ/datahike) - Datalog based db engine with persistence
* [XTDB](https://github.com/xtdb/xtdb) - Database engine with graph-oriented bitemporal indexes, Datalog, SQL & EQL queries and transaction log and document storage backends (e.g. Kafka)

### Utility
* [clojure.tools.namespace](https://github.com/clojure/tools.namespace)
* [Editscript](https://github.com/juji-io/editscript) - find and edit differences in data
* [expound](https://github.com/bhb/expound) - human readable spec error reporting
* [instaparse](https://github.com/Engelberg/instaparse) - Parser generator for context-free grammars

### Testing
* [clojure.test](https://clojure.github.io/clojure/clojure.test-api.html) - standard unit testing
* [test.check](https://github.com/clojure/test.check) - property based testing
* [Criterium](https://github.com/hugoduncan/criterium) - Benchmark testing library
* [Cloverage](https://github.com/cloverage/cloverage) - Coverage tool

### Classpath
* [tools.deps.alpha](https://github.com/clojure/tools.deps.alpha) - 
* [dynapath](https://github.com/tobias/dynapath) - library for handling the classpath programmatically

### Math
* [incanter](https://github.com/incanter/incanter) - Incanter is a Clojure-based, R-like statistical computing and graphics environment
* [clojure.math.combinatorics](https://github.com/clojure/math.combinatorics)
* [clj-math](https://github.com/lsolbach/CljMath) - Clojure Math library

### Visualization
* [oz](https://github.com/metasoarous/oz) - data visualization and scientific document processing library for Clojure built around Vega-Lite & Vega
* [cmp.jfreechart](https://github.com/lsolbach/CljComponents) - Clojure wrapper and API for JFreeChart

### I/O
#### Network Sockets
* [clj-sockets](https://github.com/atroche/clj-sockets)
* [async-sockets](https://github.com/bguthrie/async-sockets)
* [http-kit](https://github.com/http-kit/http-kit) - A simple, high-performance event-driven HTTP client+server for Clojure without external dependencies
* [aleph](https://github.com/ztellman/aleph) - Fast asynchronous HTTP server based on Netty
* [link](https://github.com/clojure-link/link)

#### Serial Communication
* [clj-serial](https://github.com/peterschwarz/clj-serial) - Serial connections with CLojure

#### MicroControllers (e.g. Arduino/ESP32)
* [clj-firmata](https://github.com/peterschwarz/clj-firmata) - Clojure implementation of the firmata protocol
* cloduino

### 3D Printing
* [scad-clj](https://github.com/farrellm/scad-clj) - OpenSCAD DSL in Clojure

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
* [seesaw](https://github.com/daveray/seesaw) - Clojure API for Java Swing
* [clj-swing](https://github.com/lsolbach/CljBase) - My Clojure API for Java Swing

##### JavaFX
* [cljfx](https://github.com/cljfx/cljfx) - a declarative, functional and extensible wrapper of JavaFX inspired by better parts of react and re-frame
* [cljfx/css](https://github.com/cljfx/css) - Charmingly Simple Styling for cljfx
* [fn-fx](https://github.com/fn-fx/fn-fx) - a functional, declarative wrapper around JavaFX / OpenJFX

#### ClojureScript
* [reagent](http://reagent-project.github.io/) - ClojureScript React programming
* [re-frame](https://github.com/Day8/re-frame)

#### ClojureScript React Native
* [ClojureScript + React Native](https://cljsrn.org/)
* [re-natal](https://github.com/drapanjanas/re-natal)
* [expo-cljs-template](https://github.com/seantempesta/expo-cljs-template)

#### UI Testing
* [Etaoin](https://github.com/igrishaev/etaoin) - Browser testing via WebDriver


### Documents/Reporting
* [clj-pdf](https://github.com/clj-pdf/clj-pdf) - Generate PDF programatically
* [cmp.poi]()
* [cmp.jfreechart]()
* [xml.]()

Applications
------------
* [Metabase](https://github.com/metabase/metabase) - Data(base) analytics and visualization

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


#### Texts
* [A Joyful Introduction to Clojure, Part I](https://medium.com/@daniel.oliver.king/a-clojure-development-environment-that-gets-out-of-your-way-c11e6711ead3)
* [A Joyful Introduction to Clojure, Part II](https://medium.com/@daniel.oliver.king/getting-work-done-in-clojure-the-building-blocks-39ad82796926)
* [A Joyful Introduction To Clojure: Part III](https://medium.com/@daniel.oliver.king/getting-real-work-done-in-clojure-application-development-683c8129a313)
* [Clojure Concurrency Tutorial](https://purelyfunctional.tv/guide/clojure-concurrency/)

#### deps.edn
* [dot-clojure](https://github.com/seancorfield/dot-clojure) - Sean Corfield's personal .clojure/deps.edn file providing useful clj aliases drawn from a variety of projects

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

### 3D Printing
* [Interactive 3D Modeling with Clojure](https://github.com/PEZ/scad-clj-workflow) - 


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
* [Spec-ulation Keynote - Rich Hickey](https://www.youtube.com/watch?v=oyLBGkS5ICk) - About changing and breaking software and how versioning artifacts doesn't help
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
* [Babashka and Small Clojure Interpreter: Clojure in new contexts - Michiel Borkent](https://www.youtube.com/watch?v=Nw8aN-nrdEk) - Use Clojure as a bash replacement and more

### Experience
* [Why Clojure? - Derek Slager](https://www.youtube.com/watch?v=BThkk5zv0DE)

### ClojureScript
* [ClojureScript for Skeptics - Derek Slager](https://www.youtube.com/watch?v=gsffg5xxFQI)

### App Development
* [ClojureScript loves React Native - Peter Strömberg](https://www.youtube.com/watch?v=QsUj7HO5xDg) - Tutorial for developing React Native apps in Clojure
* [cljfx – Bringing Clojure to the Desktop - Vlad Protsenko](https://www.youtube.com/watch?v=xcMNTKFmEgI) - Build JavaFX desktop apps with Clojure

### 3D Modelling
* [Start 3D modeling in Clojure with scad-clj and Calva - Peter Stömberg](https://www.youtube.com/watch?v=fJpDztSR53E) - Create OpenSCAD models in Clojure

Books
-----
* [Clojure for the Brave and True](https://www.braveclojure.com/) - Complete book available online and in print
* [Clojure Cookbook]()
  * [Clojure Cookbook Resources](https://github.com/clojure-cookbook/clojure-cookbook)

Blog Posts
----------
### Clojure
* [Reducers, transducers and core.async in Clojure](https://eli.thegreenplace.net/2017/reducers-transducers-and-coreasync-in-clojure/)
* [Clojure concurrency and blocking with core.async](https://eli.thegreenplace.net/2017/clojure-concurrency-and-blocking-with-coreasync/)

### ClojureScript
* [ClojureScript Macros](https://code.thheller.com/blog/shadow-cljs/2019/10/12/clojurescript-macros.html)
