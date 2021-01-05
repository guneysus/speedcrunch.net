using System;
using System.Collections.Generic;
using System.Linq.Expressions;
using System.Text;

namespace NCrunch.Exp
{
    public class ExpNode
    {
        public List<ExpNode> Children { get; protected set; } = new List<ExpNode>();
        public ExpNode Parent { get; protected set; }
        public ExpressionInfo ExpressionInfo { get; protected set; }

        public readonly string Name;
        public string Text { get; protected set; }

        public ExpNode(string name)
        {
            this.Name = name;
        }

        protected ExpNode()
        {
        }

        public ExpNode SetExp(ExpressionInfo expressionInfo)
        {
            this.ExpressionInfo = expressionInfo;
            return this;
        }

        public ExpNode SetText(string text)
        {
            this.Text = text;
            return this;
        }

        public ExpNode AddChildren(ExpNode child)
        {
            child.Parent = this;
            Children.Add(child);
            return child;
        }
    }

    public class ExpressionInfo
    {
        private readonly ExpressionType _expressionType;
        private readonly object _value;
        private readonly Type _type;

        protected ExpressionInfo(ExpressionType expressionType, object value, Type type)
        {
            this._expressionType = expressionType;
            this._value = value;
            this._type = type;
        }

        public static ExpressionInfo New(ExpressionType expressionType, object value, Type type)
            => new ExpressionInfo(expressionType, value, type);

        protected ExpressionInfo() { }
    }
}
