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
* [portal](https://github.com/djblue/portal) - A clojure tool to navigate through your data.

* [Figwheel Main](https://figwheel.org/) - Figwheel Main builds your ClojureScript code and hot loads it as you are coding
* [figwheel.main template](https://rigsomelight.com/figwheel-main-template/) - Template generator that will produce a minimal ClojureScript project that includes figwheel.main tooling

* [Babashka](https://github.com/babashka/babashka) - Clojure shell programming/bash replacement
* [planck2](https://github.com/planck-repl/planck) - ClojureScript REPL for the desktop
* [Lumo](https://github.com/anmonteiro/lumo) - Lumo is a standalone ClojureScript environment that runs on Node.js and the V8 JavaScript engine

* [tubular](https://github.com/mfikes/tubular) - A Clojure Socket REPL client
* [Clerk](https://github.com/nextjournal/clerk) - Clerk takes a Clojure namespace and turns it into a notebook


Libraries
---------
### Overview
* [Clojars](https://clojars.org/) - An easy to use community repository for open source Clojure libraries
* [The Clojure Toolbox](https://www.clojure-toolbox.com/) - Curated list of Clojure libraries

### Functional Progamming
* [medley](https://github.com/weavejester/medley) - A small collection of useful, mostly pure functions that might not look out of place in the clojure.core namespace.
* [xforms](https://github.com/cgrand/xforms) - Provides additional transducers
* [core.memoize](https://github.com/clojure/core.memoize) - Provides memoization cache implementations and strategies like LRU or TTL

### Logic Programming
* [core.logic](https://github.com/clojure/core.logic) - Prolog-like relational logic programming based on miniKanren

### Asynchronous Programming
* [core.async](https://github.com/clojure/core.async) - Asynchronous programming/communication

### Specification/Validation
* [Spec](https://github.com/clojure/spec.alpha) - Spec is Clojure core library to describe the structure of data and functions.
* [Spec2](https://github.com/clojure/spec-alpha2) - Spec2 is an evolution from spec as well as work towards several new features.
* [Malli](https://github.com/metosin/malli) - Data-driven Schemas for Clojure/Script and babashka.

### System Configuration
* [Component](https://github.com/stuartsierra/component) - Component livecycle framework
* [Integrant](https://github.com/weavejester/integrant) - Component livecycle framework
* [Mount](https://github.com/tolitius/mount) - Component livecycle framework

### SCM
* [clj-jgit](https://github.com/clj-jgit/clj-jgit) - Access git repositories from clojure. Provides the Porcelain API of JGit 
* [tools.git](https://github.com/lsolbach/CljDevTools) - The tools.git component provides a Clojure api for JGit.

### Ontologies
* [Tawny OWL](https://github.com/phillord/tawny-owl) - Tawny-OWL allows construction of OWL ontologies, in a evaluative, functional and fully programmatic environment

### Data Formats
* [tools.reader](https://github.com/clojure/tools.reader) - Read/write EDN
* [Nippy](https://github.com/ptaoussanis/nippy) - Read/write EDN, fast and compact with encryption
* [data.json](https://github.com/clojure/data.json) - Read/write JSON
* [data.csv](https://github.com/clojure/data.csv) - Read/write CSV
* [data.xml](https://github.com/clojure/data.xml) - Read/write XML
* [Charred](https://github.com/cnuernber/charred) - Zero dependency efficient read/write of json and csv data
* [clj-xpath](https://github.com/kyleburton/clj-xpath) - A library that makes it easier to work with XPath from Clojure
* [YAML](https://github.com/owainlewis/yaml) - Read/wite YAML
* [Clojure ProtoBuf](https://github.com/flatland/clojure-protobuf) - Specify/read/write ProtoBuf
* [Lancaster](https://github.com/deercreeklabs/lancaster) - Specify/read/write AVRO
* [abracad](https://github.com/damballa/abracad) - Specify/read/write AVRO
* [dove](https://github.com/piotr-yuxuan/dove) - Infer specs from AVRO schemas to use in validation and generative testing
* [BinF](https://github.com/helins/binf.cljc) - Specify/read/write general binary formats

### Data Access
* [data.zip](https://github.com/clojure/data.zip) - Zipper library to access data in nested data structures
* [core.cache](https://github.com/clojure/core.cache) - Caching data with strategies like FIFO, LU/LRU or TTL
* [Spyglass](https://github.com/clojurewerkz/spyglass) - A fast Clojure memcached client
* [next-jdbc](https://github.com/seancorfield/next-jdbc) - Database access via JDBC
* [Honey SQL](https://github.com/seancorfield/honeysql) - SQL as Clojure data structures. Build queries programmatically even at runtime without having to bash strings together.
* [clojure-hbase](https://github.com/bigmlcom/clojure-hbase) - Low level access to HBase and it's admin functions
* [clojure-hbase-schemas](https://github.com/eslick/clojure-hbase-schemas) - Simple library for schema-based access to HBase from Clojure
* [carmine](https://github.com/ptaoussanis/carmine) - A pure-Clojure Redis client & message queue

### Data Streaming
* [jackdaw](https://github.com/FundingCircle/jackdaw) - Kafka library for clojure
* [Machine Head](https://github.com/clojurewerkz/machine_head) - A Clojure MQTT client

### Database
* [Datomic](https://www.datomic.com/) - Datalog based db from Cognitect with features like immutability and temporal queries
* [Datascript](https://github.com/tonsky/datascript) - Datalog based in-memory db
* [Datalevin](https://github.com/juji-io/datalevin) - Datalog based engine with fast LMDB persistent storage
* [Datahike](https://github.com/replikativ/datahike) - Datalog based db engine with persistence
* [XTDB](https://github.com/xtdb/xtdb) - Database engine with graph-oriented bitemporal indexes, Datalog, SQL & EQL queries and transaction log and document storage backends (e.g. Kafka)
* [asami](https://github.com/threatgrid/asami) - Graph database with Datalog queries, Loom support and in-memory and persistent backends

### Utility
* [clojure.tools.namespace](https://github.com/clojure/tools.namespace)
* [rewrite-clj](https://github.com/clj-commons/rewrite-clj) - A library to parse rewrite Clojure code and edn
* [Timbre](https://github.com/ptaoussanis/timbre) - A pure Clojure/Script logging library
* [Tempura](https://github.com/ptaoussanis/tempura) - A pure Clojure/Script i18n translations library
* [Editscript](https://github.com/juji-io/editscript) - find and edit differences in data
* [expound](https://github.com/bhb/expound) - human readable spec error reporting
* [instaparse](https://github.com/Engelberg/instaparse) - Parser generator for context-free grammars
* [automat](https://github.com/ztellman/automat) - Automat is a Clojure and ClojureScript library for defining and using finite-state automata
* [clj-java-decompiler](https://github.com/clojure-goes-fast/clj-java-decompiler) - An integrated Clojure-to-Java decompiler usable from the REPL
* [clj-memory-meter](https://github.com/clojure-goes-fast/clj-memory-meter) - A Clojure library that allows you to inspect how much memory an object occupies at runtime

### Testing
* [clojure.test](https://clojure.github.io/clojure/clojure.test-api.html) - standard unit testing
* [test.check](https://github.com/clojure/test.check) - property based testing
* [](https://github.com/clojure-expectations/clojure-test) - A clojure.test-compatible version of the classic Expectations testing library
* [Cloverage](https://github.com/cloverage/cloverage) - Coverage tool

# Performance Testing/Monitoring
* [Criterium](https://github.com/hugoduncan/criterium) - Benchmark testing library
* [Tufte](https://github.com/ptaoussanis/tufte) - Simple profiling and performance monitoring for Clojure/Script
* [clj-async-profiler](https://github.com/clojure-goes-fast/clj-async-profiler) - An embedded high-precision performance profiler for Clojure

### Network
* [clj-ftp](https://github.com/miner/clj-ftp) - Wrapper over Apache Commons Net to provide easy access from Clojure

### Classpath/Dependencies
* [tools.deps](https://github.com/clojure/tools.deps) - 
* [dynapath](https://github.com/tobias/dynapath) - library for handling the classpath programmatically

### Math
* [incanter](https://github.com/incanter/incanter) - Incanter is a Clojure-based, R-like statistical computing and graphics environment
* [clojure.math.combinatorics](https://github.com/clojure/math.combinatorics) - 
* [math.core](https://github.com/soulspace-org/math.core) - Clojure/ClojureScript Math library
* [sampling](https://github.com/bigmlcom/sampling) - This library supports three flavors of random sampling: simple sampling, reservoir sampling, and stream sampling.

### Analytics/Machine Learning
* [dtype-next](https://github.com/cnuernber/dtype-next) - A Clojure library designed to aid in the implementation of high performance algorithms and systems
* [tech.ml.dataset](https://github.com/techascent/tech.ml.dataset) - A Clojure high performance data processing system (similar to Python Pandas or R data.table)
* [tablecloth](https://github.com/scicloj/tablecloth) - A dataset manipulation library built on the top of tech.ml.dataset
* [scicloj.ml](https://github.com/scicloj/scicloj.ml) - A Clojure machine learning library
* [jutsu.ai](https://github.com/hswick/jutsu.ai) - Clojure wrapper for DeepLearning4J
* [clojurecl](https://github.com/uncomplicate/clojurecl) - ClojureCL is a Clojure library for parallel computations with OpenCL
* [Deep Diamond](https://github.com/uncomplicate/deep-diamond) - Deep Diamond is a Clojure library for fast tensors and neural network related computations based on the highly optimized native libraries and computation routines for both CPU and GPU
* [histogram](https://github.com/bigmlcom/histogram) - An implementation of the streaming, one-pass histograms described in Ben-Haim's Streaming Parallel Decision Trees
* [sketchy](https://github.com/bigmlcom/sketchy) - Sketching algorithms in Clojure (e.g. Bloom Filter, Count-Min, Hyper-LogLog)
* [streampunk](https://github.com/clojurewerkz/streampunk) - Streampunk is a Clojure interface to stream summarization and cardinality estimation libraries, such as stream-lib
* [Statistiker](https://github.com/clojurewerkz/statistiker) - Statistiker is a simple way to do Statistics in Clojure. The goal is to have an implementation of all popular algorithms for mining datasets


### Visualization
* [oz](https://github.com/metasoarous/oz) - Data visualization and scientific document processing library for Clojure built around Vega-Lite & Vega
* [hanami](https://github.com/jsa-aerial/hanami) - Interactive arts and charts visualizations with Clojure(Script), Vega-lite, and Vega
* [viz.clj](https://github.com/scicloj/viz.clj) - 
* [cmp.jfreechart](https://github.com/soulspace-org/cmp.jfreechart) - Clojure wrapper and API for JFreeChart

### Cryptography
* [scrypt](https://github.com/clojurewerkz/scrypt) - scrypt is a tiny Clojure library for the scrypt key derivation function


### I/O
#### Network Sockets
* [clj-sockets](https://github.com/atroche/clj-sockets)
* [async-sockets](https://github.com/bguthrie/async-sockets)
* [http-kit](https://github.com/http-kit/http-kit) - A simple, high-performance event-driven HTTP client+server for Clojure without external dependencies
* [aleph](https://github.com/ztellman/aleph) - Fast asynchronous HTTP server based on Netty
* [link](https://github.com/clojure-link/link)

#### Email
* [Mailer](https://github.com/clojurewerkz/mailer) - Mailer is an ActionMailer-inspired mailer library for Clojure. It combines Postal, Clostache and a number of its own features and conventions to make delivering complex template-based emails as painless as possible
* [postal](https://github.com/drewr/postal) - postal is a library for constructing and sending RFC822-compliant Internet email messages

#### Serial Communication
* [clj-serial](https://github.com/peterschwarz/clj-serial) - Serial connections with CLojure

#### MicroControllers (e.g. Arduino/ESP32)
* [clj-firmata](https://github.com/peterschwarz/clj-firmata) - Clojure implementation of the firmata protocol
* cloduino

### 3D Printing
* [scad-clj](https://github.com/farrellm/scad-clj) - OpenSCAD DSL in Clojure

### Web
#### Libraries
* [ring](https://github.com/ring-clojure/ring) - Clojure HTTP server abstraction.
* [compojure](https://github.com/weavejester/compojure) - Ring routing library.
* [reitit](https://github.com/metosin/reitit) - Modern ring routing library.
* [hiccup](https://github.com/weavejester/hiccup) - Hiccup is a library for representing HTML in Clojure using vectors to represent elements, and maps to represent an element's attributes.
* [garden] (https://github.com/noprompt/garden) - Garden is a library for representing CSS in Clojure.
* [Enlive](https://github.com/cgrand/enlive) - Enlive is a selector-based (à la CSS) templating library for Clojure.
* [yada](https://github.com/juxt/yada), [yada docs](https://www.juxt.land/yada/manual/index.html) - Framework for production ready web services
* [sente](https://github.com/ptaoussanis/sente) - Client/Server communication with core.async over WebSockets or AJAX
* [etaoin](https://github.com/clj-commons/etaoin) - A pure Clojure implementation of the Webdriver protocol for browser tests

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
* [clj-swing](https://github.com/soulspace-org/clj.swing) - My Clojure API for Java Swing

##### JavaFX
* [cljfx](https://github.com/cljfx/cljfx) - a declarative, functional and extensible wrapper of JavaFX inspired by better parts of react and re-frame
* [cljfx/css](https://github.com/cljfx/css) - Charmingly Simple Styling for cljfx
* [fn-fx](https://github.com/fn-fx/fn-fx) - a functional, declarative wrapper around JavaFX / OpenJFX

#### ClojureScript
* [reagent](http://reagent-project.github.io/) - ClojureScript React programming
* [re-frame](https://github.com/Day8/re-frame) - re-frame is a ClojureScript framework for building user interfaces with a data-oriented, functional design
* [fulcro](https://github.com/fulcrologic/fulcro) - Fulcro is a library for building data-driven full-stack applications for the web, native, and desktop (via electron) based on React.

#### ClojureScript React Native
* [ClojureScript + React Native](https://cljsrn.org/)
* [re-natal](https://github.com/drapanjanas/re-natal)
* [expo-cljs-template](https://github.com/seantempesta/expo-cljs-template)

#### UI Testing
* [Etaoin](https://github.com/igrishaev/etaoin) - Browser testing via WebDriver
* [touchstone](https://github.com/ptaoussanis/touchstone) - a split testing library for Clojure (A/B (conversion) testing)

### Documents/Reporting
* [clj-pdf](https://github.com/clj-pdf/clj-pdf) - Generate PDF programatically
* [cmp.poi](https://github.com/soulspace-org/cmp.poi) - Create, read and write excel files based on Apache POI
* [cmp.jfreechart](https://github.com/soulspace-org/cmp.jfreechart) - Create charts based on JFreeChart
* [xml.dsl](https://github.com/soulspace-org/xml.dsl) - DSLs for various XML dialects like SVG, DocBook, MathML, etc.
* [Clostache](https://github.com/fhd/clostache) - Mustache templates for clojure

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

### Logic Programming
* [microLogic](http://mullr.github.io/micrologic/literate.html) - A literate Clojure implementation of miniKanren, a logic programming system which can be embedded in functional programming languages

### Datomic
* [Learn Datalog Today](http://www.learndatalogtoday.org/)

### Analytics/Machine Learning
* [OpenCV with Clojure](https://docs.opencv.org/4.x/d7/d1e/tutorial_clojure_dev_intro.html) - Introduction to OpenCV Development with Clojure
* [mxnet Clojure tutorials](https://github.com/Chouffe/mxnet-clj-tutorials) - Collection of tutorials for the Clojure MXNET package

### Web Templating/Scraping
* [Enlive Tutorial](https://github.com/swannodette/enlive-tutorial/) - 

### 3D Printing
* [Interactive 3D Modeling with Clojure](https://github.com/PEZ/scad-clj-workflow) - Workflow to create OpenSCAD models in Clojure with scad-clj, VS Code and Calva


Videos
------
### Functional Programming
* [Robert C Martin - Functional Programming; What? Why? When?](https://www.youtube.com/watch?v=7Zlp9rKHGD4)

### Clojure
* [ClojureTV](https://www.youtube.com/channel/UCaLlzGqiPE2QRj6sSOawJRg) - youtube channel

* [Java's Quirks and Wrong (?) Defaults with Brian Goetz](https://www.youtube.com/watch?v=ZyTH8uCziI4)
* [Why Brian Goetz prefers Clojure over Scala and Kotlin (as a Java language architect)](https://www.youtube.com/watch?v=GedrGWu16_I)


#### Clojure Basics
* [Clojure for Java Programmers Part 1 - Rich Hickey](https://www.youtube.com/watch?v=P76Vbsk_3J0)
* [Clojure for Java Programmers Part 2 - Rich Hickey](https://www.youtube.com/watch?v=hb3rurFxrZ8)
* [Clojure for Lisp Programmers Part 1 - Rich Hickey](https://www.youtube.com/watch?v=cPNkH-7PRTk)
* [Clojure for Lisp Programmers Part 2 - Rich Hickey](https://www.youtube.com/watch?v=7mbcYxHO0nM)
* [Clojure Data Structures Part 1 - Rich Hickey](https://www.youtube.com/watch?v=ketJlzX-254)
* [Clojure Data Structures Part 2 - Rich Hickey](https://www.youtube.com/watch?v=sp2Zv7KFQQ0)
* [Persistent Data Structures and Managed References - Rich Hickey](https://www.youtube.com/watch?v=toD45DtVCFM)
* [Clojure Concurrency - Rich Hickey](https://www.youtube.com/watch?v=nDAfZK8m5_8)
* [Simplicity Ain't Easy - Stuart Halloway](https://www.youtube.com/watch?v=cidchWg74Y4)
* [Radical Simplicity - Stuart Halloway](https://www.youtube.com/watch?v=f_Fi8YXt2fs)
* [Simple Made Easy - Rich Hickey](https://www.youtube.com/watch?v=LKtk3HCgTa8)
* [Clojure Made Simple - Rich Hickey](https://www.youtube.com/watch?v=VSdnJDO-xdg)
* [Ousterhout's Dichotomy Isn't (Part 2 of the Simplicity/Power/Focus Series) - Stuart Halloway](https://www.youtube.com/watch?v=KZ8u_sWT9Ls)
* [Effective Programs - 10 Years of Clojure - Rich Hickey](https://www.youtube.com/watch?v=2V1FtfBDsLU)
* [Transducers - Rich Hickey](https://www.youtube.com/watch?v=Tq7r97G4b7Y)
* [Inside Transducers - Rich Hickey](https://www.youtube.com/watch?v=4KqUvG8HPYo)
* [Clojure core async - Rich Hickey](https://www.youtube.com/watch?v=yJxFPoxqzWE)
* [Effective Programs - 10 Years of Clojure - Rich Hickey](https://www.youtube.com/watch?v=2V1FtfBDsLU)
* [Spec-ulation Keynote - Rich Hickey](https://www.youtube.com/watch?v=oyLBGkS5ICk) - About changing and breaking software and how versioning artifacts doesn't help
* [Maybe Not - Rich Hickey](https://www.youtube.com/watch?v=YR5WdGrpoug)
* [The Language of the System - Rich Hickey](https://www.youtube.com/watch?v=ROor6_NGIWU)
* [Design in Practice - Rich Hickey](https://www.youtube.com/watch?v=c5QF2HjHLSE)
* [A History of Clojure by Rich Hickey with Q&A](https://www.youtube.com/watch?v=nD-QHbRWcoM)

* [REBL - Stuart Halloway](https://www.youtube.com/watch?v=c52QhiXsmyI)
* [Always Be Composing - Zach Tellman](https://www.youtube.com/watch?v=3oQTSP4FngY)
* [Everything Will Flow - Zach Tellman](https://www.youtube.com/watch?v=1bNOO3xxMc0)
* [Solving Problems the Clojure Way - Rafal Dittwald](https://www.youtube.com/watch?v=vK1DazRK_a0) - Functional refactoring of an application (JS example ;-))
* [Bottom Up vs Top Down Design in Clojure - Mark Bastian](https://www.youtube.com/watch?v=Tb823aqgX_0)
* [Condition Systems in an Exceptional Language - Chris Houser](https://www.youtube.com/watch?v=zp0OEDcAro0)


#### Workflow
* [Clojure Basics: Editor and Tooling Setup](https://www.youtube.com/watch?v=kjJVfoqFj_k)
* [1. Atom, Chlorine, and Cognitect's REBL - Sean Corfield](https://www.youtube.com/watch?v=ZhzMoEz4j1k)
* [2. Clojure CLI/deps.edn - Sean Corfield](https://www.youtube.com/watch?v=CWjUccpFvrg)
* [3. Fixing a bug in core.memoize - Sean Corfield](https://www.youtube.com/watch?v=UFY2rd05W2g)
* [Proto REPL, a New Clojure Development and Visualization Tool - Jason Gilman](https://www.youtube.com/watch?v=buPPGxOnBnk&feature=youtu.be)
* [Cursive: A different type of IDE - Colin Fleming](https://www.youtube.com/watch?v=vt1y2FbWQMg)
* [Hammock Driven Development - Rich Hickey](https://www.youtube.com/watch?v=f84n5oFoZBc)
* [Babashka and Small Clojure Interpreter: Clojure in new contexts - Michiel Borkent](https://www.youtube.com/watch?v=Nw8aN-nrdEk) - Use Clojure as a bash replacement and more
* [Tapping into one of Clojure's superpowers with Portal by James Trunk](https://www.youtube.com/watch?v=A-QvUw5LLVU)
* [Testing Stateful and Concurrent Systems Using test.check - Eric Normand](https://www.youtube.com/watch?v=r5i_OiZw6Sw)

### Experience
* [Why Clojure? - Derek Slager](https://www.youtube.com/watch?v=BThkk5zv0DE)
* [Core.Async in Use - Timothy Baldridge](https://www.youtube.com/watch?v=096pIlA3GDo)

### ClojureScript
* [ClojureScript for Skeptics - Derek Slager](https://www.youtube.com/watch?v=gsffg5xxFQI)

### App Development
* [ClojureScript loves React Native - Peter Strömberg](https://www.youtube.com/watch?v=QsUj7HO5xDg) - Tutorial for developing React Native apps in Clojure
* [cljfx – Bringing Clojure to the Desktop - Vlad Protsenko](https://www.youtube.com/watch?v=xcMNTKFmEgI) - Build JavaFX desktop apps with Clojure

### 3D Modelling
* [Start 3D modeling in Clojure with scad-clj and Calva - Peter Stömberg](https://www.youtube.com/watch?v=fJpDztSR53E) - Create OpenSCAD models in Clojure

### Visualization
* [Vega & Vegalite - Christopher Small](https://www.youtube.com/watch?v=hXq5Bb40zZY) - Create interactive data visualizations in Clojure with Oz and Vega/Vegalite

### Machine Learning and AI
* [Vector Symbolic Architectures In Clojure - Carin Meier](https://www.youtube.com/watch?v=j7ygjfbBJD0)


Books
-----
* [Clojure for the Brave and True](https://www.braveclojure.com/) - Complete book available online and in print
* [Clojure Cookbook]()
  * [Clojure Cookbook Resources](https://github.com/clojure-cookbook/clojure-cookbook)

Blog Posts
----------
### Clojure
* [Why Clojure?](https://blog.cleancoder.com/uncle-bob/2019/08/22/WhyClojure.html)
* [Reducers, transducers and core.async in Clojure](https://eli.thegreenplace.net/2017/reducers-transducers-and-coreasync-in-clojure/)
* [Clojure concurrency and blocking with core.async](https://eli.thegreenplace.net/2017/clojure-concurrency-and-blocking-with-coreasync/)

### ClojureScript
* [ClojureScript Macros](https://code.thheller.com/blog/shadow-cljs/2019/10/12/clojurescript-macros.html)
