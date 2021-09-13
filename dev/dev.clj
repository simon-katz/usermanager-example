(ns dev
  (:require
   [clojure.main]
   [com.stuartsierra.component :as component]
   [usermanager.main :as main]))

;;;; ___________________________________________________________________________
;;;; Require the standard REPL utils.
;;;;
;;;; This is useful in a `dev` namespace, and is needed in a `user` namespace
;;;; because the requires get blatted by `tnr/refresh` and `reset`.

(apply require clojure.main/repl-requires)

;;;; ___________________________________________________________________________

(def system (main/new-system 8888))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn start []
  (alter-var-root #'system component/start))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn stop []
  (alter-var-root #'system component/stop))
