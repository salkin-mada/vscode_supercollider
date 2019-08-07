Ndef.ar(\grammar, {SinOsc.ar(freq: 321, mul: 0.5)}).playN([0,1,2,3])

play{|pip=1e-3|Klang.ar(`[(_.linexp(0,2e4,99,1e4))!2e4,pip]).tanh!2}

2pi, 0.43, 0x123, 12e3, 3e-2
"strst" ~tilde _that symbolArg: \symb 'symb'

$a $/ $\\ ($ )

classvar const super this arg |pipes| var false inf nil true thisFunction thisFunctionDef 
thisMethod thisProcess thisThread currentEnvironment topEnvironment		
linlin explin linexp expexp min max round trunc atan2 hypot hypotApx ring1 ring2 ring3 
ring4 sumsqr difsqr sqrsum sqrdif absdif thresh amclip scaleneg clip2 wrap2 fold2 
excess neg reciprocal abs floor ceil frac sign squared cubed sqrt exp midicps 
cpsmidi midiratio ratiomidi dbamp ampdb octcps cpsoct log log2 log10 sin cos tan 
asin acos atan sinh cosh tanh distort softclip isPositive isNegative isStrictlyPositive
new yield break rescue return case begin do forBy loop if while else
.play play{} .scope scope{} .plot plot{} .playN .asBuffer