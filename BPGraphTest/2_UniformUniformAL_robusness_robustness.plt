set title '2_UniformUniformAL_robusness: Robustness index for 5 runs (avg = 72.49032258064516)'
set xlabel 'Run'
set ylabel 'Robusness index (%)'
set xrange [0:4]
set yrange [-100:100]
plot "2_UniformUniformAL_robusness_robustness.dat" using 1 notitle with line

