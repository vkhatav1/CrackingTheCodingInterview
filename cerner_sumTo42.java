import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class sumTo42 {
	static int count = 0;
	enum Op {
		PLUS("+", Math::addExact),
		MINUS("-", Math::subtractExact),
		MUL("*", Math::multiplyExact),
		DIV("/", Math::floorDiv);

		String opName;
		BiFunction<Integer, Integer, Integer> opFunc;

		Op(String opName, BiFunction<Integer, Integer, Integer> opFunc) {
			this.opName = opName;
			this.opFunc = opFunc;
		}

		int apply(int i, int y) {
			return opFunc.apply(i, y);
		}
	}

	static Stream<List<Op>> ops() {
		return perms_(0, 4, true, Arrays.asList(Op.values()), new ArrayList<>());
	}

	static Stream<List<Integer>> perms(int n) {
		List<Integer> li = IntStream.range(0, n + 1)
			.mapToObj(x -> x)
			.collect(Collectors.toList());
		return perms_(0, 5, false, li, new ArrayList<>());
	}

	static <Z> Stream<List<Z>> perms_(int count, int limit, boolean dup, List<Z> input, List<Z> acc) {
		if (count == limit) {
			return Stream.of(acc);
		} else {
			return input.stream()
				.filter(x -> dup || !acc.contains(x))
				.flatMap(x -> {
				    List<Z> newAcc = new ArrayList<>(acc);
					newAcc.add(x);
					return perms_(count + 1, limit, dup, input, newAcc);
				});
		}
	}

	public static void main(String[] args) {
		perms(52).limit(100).forEach(p -> {
			ops().filter(ops -> {
				int res = p.get(0);
				int index = 1;
				for (Op op : ops) {
					res = op.apply(res, p.get(index++));
				}
				return res == 42;
			})
			.findFirst()
			.ifPresent(ops -> count = count+1);
		});
		if(count > 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
}
