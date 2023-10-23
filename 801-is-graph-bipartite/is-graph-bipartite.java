class Solution {
    public boolean isBipartite(int[][] graph) {
  
		Queue<Pair> q = new LinkedList<>();
		HashMap<Integer, Integer> visited = new HashMap<>();

		for (int src = 0; src < graph.length; src++) {
			if (visited.containsKey(src)) {
				continue;
			}

			q.add(new Pair(src, 0));
			while (!q.isEmpty()) {
				// 1 remove
				Pair rv = q.remove();
				// 2 ignore if ALready visited
				if (visited.containsKey(rv.vtx)) {
					if (visited.get(rv.vtx) != rv.lv) {
						// odd length
						return false;
					} else {
						continue;
					}
				}
				// 3 marked visited
				visited.put(rv.vtx, rv.lv);
				// 5 unvisited nbrs ko add krna
				for (int nbrs : graph[rv.vtx]) {
					if (!visited.containsKey(nbrs)) {
						q.add(new Pair(nbrs, rv.lv + 1));
					}
				}

			}
		}
		return true;
	}

	static class Pair {
		int vtx, lv;
		public Pair(int vt, int lv) {
			this.vtx = vt;
			this.lv = lv;
		}
	}
}