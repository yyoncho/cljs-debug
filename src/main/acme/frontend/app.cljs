(ns acme.frontend.app)

(defn init [])

(defn two-args-2 [r b]
  (swap! r inc)
  (swap! r inc)
  (swap! r inc)
  (swap! r inc))

(defn two-args [a b]
  (let [c (atom (+ b a))]
    (swap! c inc)
    (swap! c inc)
    (swap! c inc)
    (swap! c inc)
    (two-args-2 c b)))


(two-args 1 2)
