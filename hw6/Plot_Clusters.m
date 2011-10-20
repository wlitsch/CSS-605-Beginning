% plot clustering results for CSS 605

clear all 
close all
file = importData('Clusters.txt');
pointsX = file(:,1);
pointsY = file(:,2);
centroidN = file(:,3);
centroidsX = file(:,4);
centroidsY = file(:,5);
clear file

i1 = find(centroidN == 1);
p1x = pointsX(i1);
p1y = pointsY(i1);
c1x = centroidsX(i1(1));
c1y = centroidsY(i1(1));

i2 = find(centroidN == 2);
p2x = pointsX(i2);
p2y = pointsY(i2);
c2x = centroidsX(i2(1));
c2y = centroidsY(i2(1));

i3 = find(centroidN == 3);
p3x = pointsX(i3);
p3y = pointsY(i3);
c3x = centroidsX(i3(1));
c3y = centroidsY(i3(1));

plot(p1x,p1y,'b.',p2x,p2y,'r.',p3x,p3y,'g.',c1x,c1y,'bo',c2x,c2y,'ro',c3x,c3y,'go');
axis tight
legend('cluster 1', 'cluster 2', 'cluster 3'), xlabel('Player 1 score'), ylabel('Player 2 score')