(ns user
  (:require
   [clojure.main]))

;;;; ___________________________________________________________________________
;;;; Require the standard REPL utils.
;;;;
;;;; This is useful in a `dev` namespace, and is needed in a `user` namespace
;;;; because the requires get blatted by `tnr/refresh` and `reset`.

(apply require clojure.main/repl-requires)

;;;; ___________________________________________________________________________

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn dev []
  (require 'dev)
  (in-ns 'dev))
