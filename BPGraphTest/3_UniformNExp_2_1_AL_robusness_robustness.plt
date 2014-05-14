set title '3_UniformNExp_2_1_AL_robusness: Robustness index for 25 runs (avg = 88.58919298245614)'
set xlabel 'Run'
set ylabel 'Robusness index (%)'
set xrange [0:24]
set yrange [-100:100]
plot "3_UniformNExp_2_1_AL_robusness_robustness.dat" using 1 notitle with line

