This Java programme simulates an N-body system evolving under a specified law of gravity. The programme uses Verlet Integration algorithm to update the positions and velocities of N bodies over time.

The main programme takes four arguments. To run this simulation in terminal, please type:
     "java NbodyVerlet traj.xyz energy.xyz settings.input entries.input"

###########################################
****************** OUTPUT *****************
###########################################

Terminal returns Name of planet \t Number of orbits it completed \t Period of one orbit \t Perihelion \t Aphelion \t Period using Keplers 3rd law.

**traj.xyz** is an output file containing the positions of N bodies after each time step, printed in a format that is visualisable by VMD (http://www.ks.uiuc.edu/Research/vmd/).

**energy.xyz** is an output file containing the total energy of the whole N-body system after each time step.

###########################################
****************** INPUT ******************
###########################################

**settings.input** file contains parameters of the time evolution in the order: number of timesteps, size of time step, force constant.

**entries.input** file contains initial values of N bodies in the following order: 
Number of bodies \n 
label, mass \n
x-position, y-position, z-position \n
x-velocity, y-velocity, z-velocity.

The units set of the entries and parameters in the sample inputs is chosen as kilogram-kilometer-day.The gravitational constant has been scaled to fit this choice of units.

In the sample **settings.input** file, the timestep "0.125" hence means 0.125 days, ie 3 hours. The current number of timesteps is 29200, ie 10 years.

You are free to choose your own set of units as long as you scale all input values properly.
