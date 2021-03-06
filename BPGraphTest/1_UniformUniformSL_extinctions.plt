# Extinction sequence for 30 applications  and 30 platforms.
set title '1_UniformUniformSL_extinctions.dat: Extinction sequences (avg robustness = <AVG>%)'
set xlabel 'Platformed Killed'
set ylabel 'Applications Alive'
set xrange [0:30]
set yrange [0:30]
plot \
"1_UniformUniformSL_extinctions.dat" using 2 notitle with lines lc rgb 'grey', \
"1_UniformUniformSL_extinctions.dat" using 3 notitle with lines lc rgb 'grey', \
"1_UniformUniformSL_extinctions.dat" using 4 notitle with lines lc rgb 'grey', \
"1_UniformUniformSL_extinctions.dat" using 5 notitle with lines lc rgb 'grey', \
"1_UniformUniformSL_extinctions.dat" using 6 notitle with lines lc rgb 'grey', \
"1_UniformUniformSL_extinctions.dat" using 7 title 'Average' with lines lw 2 lc rgb 'red', \
"1_UniformUniformSL_extinctions.dat" using 8 title 'Reference' with line lt 'dashed' lw 2 lc rgb 'black'
