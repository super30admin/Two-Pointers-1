def sortColours(self, colours ) :

	tail = 0
	for c in (0,1,2) :
		for id in range(tail,len(colours)) :
			if colours[id] == c :
				colours[tail], colours[id] = colours[id], colours[tail]
				tail += 1

	return colours

